package com.cts.swd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public ModelAndView greetAction(@RequestParam(name="unm",required = false) String userName) {
		String greeting=null;
		
		if(userName!=null) {
			greeting="Hello " + userName;
		}
		
		return new ModelAndView("greet-page","greeting",greeting);
	}
}
