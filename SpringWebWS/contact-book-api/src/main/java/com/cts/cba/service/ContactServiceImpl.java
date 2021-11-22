package com.cts.cba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cba.entity.Contact;
import com.cts.cba.exception.ContactBookException;
import com.cts.cba.repo.ContactRepo;

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