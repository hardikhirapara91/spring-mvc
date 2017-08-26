package com.hardik.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contact Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String showMessage(ModelMap model) {
		return "hello";
	}
}
