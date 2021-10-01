package com.cts.iod.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.cts.iod.model.Contact;

public class App5 {

	public static void main(String[] args) {
		
		File file = new File("contacts.data");
		
		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))){
			List<Contact> contacts = (List<Contact>) oin.readObject();
			for(Contact c : contacts) {
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
