package com.hardik.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hardik.spring.exception.SpringException;
import com.hardik.spring.model.Student;

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
	 * Show add student form
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String toStudent(ModelMap model) {
		model.addAttribute("student", new Student());
		return "student";
	}

	/**
	 * Add student
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ExceptionHandler({ SpringException.class })
	public String doStudent(Student student, ModelMap model) {

		if (student.getName().length() < 3) {
			throw new SpringException("Student name must be 4 characters long.");
		}

		model.addAttribute("student", student);

		return "welcome";
	}

}
