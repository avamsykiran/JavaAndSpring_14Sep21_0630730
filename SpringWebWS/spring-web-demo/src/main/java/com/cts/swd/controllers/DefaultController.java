package com.cts.swd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

	//@RequestMapping(value = "/",method=RequestMethod.GET)
	@GetMapping("/")
	public String homePageAction() {
		return "home-page";
	}
	
	@RequestMapping("/header")
	public ModelAndView headerAction() {
		return new ModelAndView("header-page","webApptitle","My Spring Web App");
	}
	
	@RequestMapping("/footer")
	public String footerAction() {
		return "footer-page";
	}
}
