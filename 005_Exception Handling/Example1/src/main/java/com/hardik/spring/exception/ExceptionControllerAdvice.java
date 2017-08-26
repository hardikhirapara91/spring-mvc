package com.hardik.spring.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Exception Controller Advice
 * 
 * @author HARDIK HIRAPARA
 *
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

	/**
	 * Handle Exception
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception ex) {
		ModelAndView model = new ModelAndView("exception");
		model.addObject("name", ex.getClass().getSimpleName());
		model.addObject("message", ex.getMessage());
		return model;
	}
}
