package com.hardik.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello World! Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

	/**
	 * Print welcome message
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcomeMessage(ModelMap model) {
		model.addAttribute("message", "Hello World!");
		return "welcome";
	}

	/**
	 * Print another welcome message
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printAnotherWelcomeMessage(ModelMap model) {
		model.addAttribute("message", "Hello World! Welcome");
		return "welcome";
	}
}
