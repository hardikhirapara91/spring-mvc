package com.hardik.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Welcome Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String toWelcome(ModelMap model) {
		model.addAttribute("message", "Hello World!");
		return "welcome";
	}
}
