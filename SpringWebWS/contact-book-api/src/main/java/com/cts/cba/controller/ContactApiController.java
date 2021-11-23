package com.cts.cba.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cba.entity.Contact;
import com.cts.cba.exception.ContactBookException;
import com.cts.cba.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactApiController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping
	public ResponseEntity<List<Contact>> allContactsAction() throws ContactBookException{
		return new ResponseEntity<List<Contact>>(contactService.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{cid}")
	public ResponseEntity<Contact> contactByIdAction(@PathVariable("cid") Long contactId) throws ContactBookException{
		Contact contact = contactService.getById(contactId);
		return contact==null ? 
				new ResponseEntity<>(HttpStatus.NOT_FOUND):
				new ResponseEntity<>(contact,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Contact> createContactAction(
			@RequestBody @Valid Contact contact,BindingResult result) throws ContactBookException{
		
		if(result.hasErrors()) {
			String errMsg = result.getAllErrors().stream().
					map(e -> e.getDefaultMessage()).
					reduce((msg1,msg2) -> String.format("%s,%s",msg1,msg2)).
					orElse("");
			throw new ContactBookException(errMsg);
		}
		
		contact = contactService.add(contact);
		return new ResponseEntity<Contact>(contact, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Contact> modifyContactAction(
			@RequestBody @Valid Contact contact,BindingResult result) throws ContactBookException{
		
		if(result.hasErrors()) {
			String errMsg = result.getAllErrors().stream().
					map(e -> e.getDefaultMessage()).
					reduce((msg1,msg2) -> String.format("%s,%s",msg1,msg2)).
					orElse("");
			throw new ContactBookException(errMsg);
		}
		
		contact = contactService.modify(contact);
		return new ResponseEntity<Contact>(contact, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{cid}")
	public ResponseEntity<Void> deleteContactByIdAction(@PathVariable("cid") Long contactId) throws ContactBookException{
		contactService.deleteById(contactId);
		return 	new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
