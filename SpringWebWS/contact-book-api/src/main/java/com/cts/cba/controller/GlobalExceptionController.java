package com.cts.cba.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.cts.cba.exception.ContactBookException;

@RestControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(ContactBookException.class)
	public ResponseEntity<String> handleContactBookException(ContactBookException exp) {
		return new ResponseEntity<String>(exp.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception exp) {
		//log exp
		return new ResponseEntity<String>("A server side issue boccured! it is being resolved.",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
