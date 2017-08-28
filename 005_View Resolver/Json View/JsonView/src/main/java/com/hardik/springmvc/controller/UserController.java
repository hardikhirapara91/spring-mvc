package com.hardik.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hardik.springmvc.model.User;

/**
 * User Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 * User XML View
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody User getUserInXml() {
		User user = new User(1, "Hardik", "Hirapara");
		return user;
	}
}
