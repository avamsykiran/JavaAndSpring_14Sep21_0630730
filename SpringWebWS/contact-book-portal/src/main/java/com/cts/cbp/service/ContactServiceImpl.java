package com.cts.cbp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cbp.entity.Contact;
import com.cts.cbp.exception.ContactBookException;
import com.cts.cbp.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo dao;

	public ContactServiceImpl() {

	}

	@Override
	public List<Contact> getAll() throws ContactBookException {
		return dao.findAll();
	}

	@Override
	public Contact getById(Long cid) throws ContactBookException {
		return dao.findById(cid).orElse(null);
	}

	@Override
	public Contact add(Contact contact) throws ContactBookException {
		if (contact != null) {

			if (dao.existsById(contact.getCid()))
				throw new ContactBookException("Duplicate contact id");

			contact = dao.save(contact);
		}
		return contact;
	}

	@Override
	public Contact modify(Contact contact) throws ContactBookException {
		if (contact != null) {
			if (!dao.existsById(contact.getCid()))
				throw new ContactBookException("Contact Not Found");

			contact = dao.save(contact);
		}
		return contact;
	}

	@Override
	public void deleteById(Long cid) throws ContactBookException {
		dao.deleteById(cid);
	}

}