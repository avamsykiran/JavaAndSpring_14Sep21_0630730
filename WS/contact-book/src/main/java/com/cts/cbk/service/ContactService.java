package com.cts.cbk.service;

import java.util.List;

import com.cts.cbk.exception.ContactBookException;
import com.cts.cbk.model.Contact;

public interface ContactService {

	List<Contact> getAll() throws ContactBookException;
	Contact getById(int cid) throws ContactBookException;
	Contact add(Contact contact) throws ContactBookException;
	Contact modify(Contact contact) throws ContactBookException;
	void deleteById(int cid) throws ContactBookException;

}
