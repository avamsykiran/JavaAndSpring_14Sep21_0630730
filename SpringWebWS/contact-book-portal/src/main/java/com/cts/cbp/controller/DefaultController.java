package com.cts.cbp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@RequestMapping("/header")
	public ModelAndView headerAction() {
		return new ModelAndView("header-page","webApptitle","ContactBook");
	}
	
	@RequestMapping("/footer")
	public String footerAction() {
		return "footer-page";
	}
}
