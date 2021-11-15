package com.cts.cbp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.cbp.exception.ContactBookException;
import com.cts.cbp.service.ContactService;

@Controller
public class ContactsController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/")
	public ModelAndView homePageAction() throws ContactBookException {
		return new ModelAndView("home-page", "contactList", contactService.getAll());
	}
}
