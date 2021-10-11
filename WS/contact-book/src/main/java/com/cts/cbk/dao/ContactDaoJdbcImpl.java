package com.cts.cbk.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.cbk.exception.ContactBookException;
import com.cts.cbk.model.Contact;
import com.cts.cbk.util.ConnectionProvider;

public class ContactDaoJdbcImpl implements ContactDao {

	public static final String GET_ALL_QRY = "SELECT * FROM contacts";
	public static final String GET_BY_ID_QRY = "SELECT * FROM contacts WHERE cid=?";
	public static final String INS_QRY = "INSERT INTO contacts VALUES(?,?,?,?,?)";
	public static final String UPD_QRY = "UPDATE contacts SET fnm=?,mob=?,email=?,dob=? WHERE cid=?";
	public static final String DEL_QRY = "DELTE FROM contacts WHERE cid=?";

	@Override
	public List<Contact> getAll() throws ContactBookException {
		List<Contact> contacts = new ArrayList<>();

		try (Connection con = ConnectionProvider.getInstance().getConnection();
				PreparedStatement pst = con.prepareStatement(GET_ALL_QRY);) {

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Contact c = new Contact();
				c.setCid(rs.getLong(1));
				c.setFullName(rs.getString(2));
				c.setMobile(rs.getString(3));
				c.setEmail(rs.getString(4));
				c.setDateOfBirth(rs.getDate(5).toLocalDate());
				contacts.add(c);
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
			// log these exceptions here....
			throw new ContactBookException("Unable to fetech the data!");
		}

		return contacts;
	}

	@Override
	public Contact getById(int cid) throws ContactBookException {
		Contact contact = null;

		try (Connection con = ConnectionProvider.getInstance().getConnection();
				PreparedStatement pst = con.prepareStatement(GET_BY_ID_QRY);) {

			pst.setInt(1, cid);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				contact = new Contact();
				contact.setCid(rs.getLong(1));
				contact.setFullName(rs.getString(2));
				contact.setMobile(rs.getString(3));
				contact.setEmail(rs.getString(4));
				contact.setDateOfBirth(rs.getDate(5).toLocalDate());
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
			// log these exceptions here....
			throw new ContactBookException("Unable to fetech the data!");
		}

		return contact;
	}

	@Override
	public Contact add(Contact contact) throws ContactBookException {
		try (Connection con = ConnectionProvider.getInstance().getConnection();
				PreparedStatement pst = con.prepareStatement(INS_QRY);) {

			pst.setLong(1, contact.getCid());
			pst.setString(2,contact.getFullName());
			pst.setString(3, contact.getMobile());
			pst.setString(4, contact.getEmail());
			pst.setDate(5, Date.valueOf(contact.getDateOfBirth()));
			
			pst.executeUpdate();
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			// log these exceptions here....
			throw new ContactBookException("Unable to save the data!");
		}

		return contact;
	}

	@Override
	public Contact modify(Contact contact) throws ContactBookException {
		try (Connection con = ConnectionProvider.getInstance().getConnection();
				PreparedStatement pst = con.prepareStatement(UPD_QRY);) {
			
			pst.setString(1,contact.getFullName());
			pst.setString(2, contact.getMobile());
			pst.setString(3, contact.getEmail());
			pst.setDate(4, Date.valueOf(contact.getDateOfBirth()));
			pst.setLong(5, contact.getCid());
			
			pst.executeUpdate();
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			// log these exceptions here....
			throw new ContactBookException("Unable to save the data!");
		}

		return contact;
	}

	@Override
	public void deleteById(int cid) throws ContactBookException {
		try (Connection con = ConnectionProvider.getInstance().getConnection();
				PreparedStatement pst = con.prepareStatement(DEL_QRY);) {
			pst.setLong(1, cid);
			
			pst.executeUpdate();
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			// log these exceptions here....
			throw new ContactBookException("Unable to delete the data!");
		}
	}

}
