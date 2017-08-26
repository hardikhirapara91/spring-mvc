package com.hardik.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
public class HelloController {

	@RequestMapping(value = "/reqheader", method = RequestMethod.GET)
	public String getRequestHeader(
			@RequestHeader(value = "User-Agent", defaultValue = "User-Agent Not Found") String userAgent,
			ModelMap model) {
		model.addAttribute("user_agent", userAgent);
		return "hello";
	}
}
