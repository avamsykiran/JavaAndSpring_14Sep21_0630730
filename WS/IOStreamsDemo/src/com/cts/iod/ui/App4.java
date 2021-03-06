package com.cts.iod.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.cts.iod.model.Contact;

public class App4 {

	public static void main(String[] args) {
		
		List<Contact> contacts = new ArrayList<>();
		
		contacts.add(new Contact(1,"Vamsy","9052224753"));
		contacts.add(new Contact(2,"Vinay","8052224753"));
		contacts.add(new Contact(3,"Vinodh","7052224753"));
		contacts.add(new Contact(4,"Vikram","6052224753"));
		contacts.add(new Contact(5,"Vasu","2052224753"));
		
		File file = new File("contacts.data");
		
		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file))){
			oout.writeObject(contacts);
			System.out.println("Contacts are saved");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
