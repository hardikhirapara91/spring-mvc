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
	 * First View
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String firstView(ModelMap model) {
		return "first";
	}

	/**
	 * Second View
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/second", method = RequestMethod.GET)
	public String secondView(ModelMap model) {
		return "redirect:third";
	}

	/**
	 * Third View
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/third", method = RequestMethod.GET)
	public String thirdView(ModelMap model) {
		return "third";
	}
}
