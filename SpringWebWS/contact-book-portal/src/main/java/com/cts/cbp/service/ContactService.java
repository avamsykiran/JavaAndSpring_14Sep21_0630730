package com.cts.cbp.service;

import java.util.List;

import com.cts.cbp.entity.Contact;
import com.cts.cbp.exception.ContactBookException;

public interface ContactService {
	List<Contact> getAll() throws ContactBookException;
	Contact getById(Long cid) throws ContactBookException;
	Contact add(Contact contact) throws ContactBookException;
	Contact modify(Contact contact) throws ContactBookException;
	void deleteById(Long cid) throws ContactBookException;
}