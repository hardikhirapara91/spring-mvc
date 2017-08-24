package com.hardik.spring.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
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

	@RequestMapping(value = "/exception", method = RequestMethod.GET)
	public String showExceptionView() throws IOException {

		// Generate exception
		if (true) {
			throw new IOException("Generated IO Exception.");
		}

		return "hello";
	}
}
