package com.cts.sbdd.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.sbdd.entity.Contact;
import com.cts.sbdd.exception.ContactBookException;
import com.cts.sbdd.service.ContactService;
import com.cts.sbdd.service.ContactServiceImpl;

@Component
public class ContactUI {

	@Autowired
	Scanner kbin;
	
	@Autowired
	ContactService contactService;
	
	public void run() {
		Menu m = null;
		while(m!=Menu.QUIT) {
			m = readMenu();
			switch(m) {
			case LIST: listContacts();break;
			case ADD: addContact(); break;
			case DELETE: deleteContact(); break;
			case QUIT: System.out.println("App Termianted");break;
			}
		}
	}
	
	public Menu readMenu() {
		System.out.println("Option\tCommand");
		System.out.println("--------------------------------");
		for(Menu m : Menu.values())
			System.out.println(m.ordinal()+"\t"+m);
		System.out.print("Option:> ");
		int option = kbin.nextInt();
		
		return Menu.values()[option];
	}
	
	public void listContacts() {
		try {
			List<Contact> contacts = contactService.getAll();
			if(contacts.isEmpty())
				System.out.println("No records found!");
			else
				contacts.stream().forEach(System.out::println);
		} catch (ContactBookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addContact() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Contact contact = new Contact();
		System.out.print("Id> ");
		contact.setCid(kbin.nextLong());
		System.out.print("Name: ");
		contact.setFullName(kbin.next());
		System.out.print("Email: ");
		contact.setEmail(kbin.next());
		System.out.print("Mobile: ");
		contact.setMobile(kbin.next());
		System.out.print("Date Of Birth(dd-MM-yyyy): ");
		String dobStr = kbin.next();
		contact.setDateOfBirth(LocalDate.parse(dobStr, dtf));
		
		try {
			contactService.add(contact);
			System.out.println("Contact Saved!");
		} catch (ContactBookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteContact() {
		System.out.print("Id> ");
		long cid = kbin.nextLong();
		
		try {
			contactService.deleteById(cid);
			System.out.println("Contact Deleted!");
		} catch (ContactBookException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
