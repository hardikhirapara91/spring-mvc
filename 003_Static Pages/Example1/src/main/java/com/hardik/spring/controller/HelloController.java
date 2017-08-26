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

	/**
	 * Welcome View
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String firstView(ModelMap model) {
		return "welcome";
	}

	/**
	 * Show Terms & Condition Page
	 * 
	 * @return
	 */
	@RequestMapping(value = "/terms", method = RequestMethod.GET)
	public String showTermsAndCondition() {
		return "redirect:/static/terms.html";
	}
}
