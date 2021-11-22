package com.cts.cbp.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cts.cbp.exception.ContactBookException;

@ControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(ContactBookException.class)
	public ModelAndView handleContactBookException(ContactBookException exp) {
		return new ModelAndView("error-page","errMsg",exp.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception exp) {
		//log exp
		return new ModelAndView("error-page","errMsg","A server side issue boccured! it is being resolved.");
	}
}
