package com.cts.sbdd.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.sbdd.dao.ContactDao;
import com.cts.sbdd.entity.Contact;
import com.cts.sbdd.exception.ContactBookException;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDao dao;
	
	public ContactServiceImpl() {
		
	}

	private boolean isValidCid(Long cid) {
		return cid>0;
	}
	
	private boolean isValidFullName(String fullName) {
		return fullName!=null && fullName.matches("[A-Z][a-z\\s]{4,49}");
	}
	
	private boolean isValidMobile(String mobile) {
		return mobile!=null && mobile.matches("[1-9][0-9]{9}");
	}
	
	private boolean isValidDateOfBirth(LocalDate dateOfBirth) {
		return dateOfBirth!=null && dateOfBirth.isBefore(LocalDate.now());
	}
	
	private boolean isValidContact(Contact contact) throws ContactBookException{
		List<String> errMsgs = new ArrayList<String>();
		
		if(!isValidCid(contact.getCid()))
			errMsgs.add("Contact Id must be a non-zero non-negative number");
		
		if(!isValidFullName(contact.getFullName()))
			errMsgs.add("Full Name must be of 5 to 50 chars in length and start in Capital");
		
		if(!isValidMobile(contact.getMobile()))
			errMsgs.add("Mobile number is a 10 digit number");
		
		if(!isValidDateOfBirth(contact.getDateOfBirth()))
			errMsgs.add("Date of birth can not be a future date");
		
		if(!errMsgs.isEmpty())
			throw new ContactBookException(errMsgs.toString());
			
		return true;
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
		if(contact!=null) {
			
			if(dao.existsById(contact.getCid()))
				throw new ContactBookException("Duplicate contact id");
			
			if(isValidContact(contact)) {
				contact = dao.save(contact);
			}
		}
		return contact;
	}

	@Override
	public Contact modify(Contact contact) throws ContactBookException {
		if(contact!=null) {
			if(!dao.existsById(contact.getCid()))
				throw new ContactBookException("Contact Not Found");
						
			if(isValidContact(contact)) {
				contact = dao.save(contact);
			}
		}
		return contact;
	}

	@Override
	public void deleteById(Long cid) throws ContactBookException {
		dao.deleteById(cid);
	}

}
