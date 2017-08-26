package com.hardik.spring.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Cookie Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
public class CookieController {

	/**
	 * Create
	 * 
	 * @return
	 */
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String createCookie(HttpServletRequest request, HttpServletResponse response, ModelMap model) {

		// Create cookie object
		Cookie cookie = new Cookie("spring-cookie", "Hello World! This is spring cookie.");
		cookie.setMaxAge(10000);
		response.addCookie(cookie);

		model.addAttribute("message", "Success! Cookie created successfully.");
		return "success";
	}

	/**
	 * Get
	 * 
	 * @return
	 */
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public String getCookie(
			@CookieValue(value = "spring-cookie", defaultValue = "Cookie is not found.") String cookieValue,
			ModelMap model) {

		model.addAttribute("message", "Cookie Value: " + cookieValue);
		return "success";
	}
}
