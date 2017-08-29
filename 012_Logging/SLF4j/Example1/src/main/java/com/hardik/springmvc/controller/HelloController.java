package com.hardik.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		logger.debug("welcome() is executed, value {}", "Hello World!");
		logger.error("This is Error message", new Exception("Testing"));

		model.addAttribute("message", "Hello World!");
		return "hello";
	}

}
