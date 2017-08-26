package com.hardik.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hardik.spring.model.Customer;

/**
 * Cookie Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Controller
@RequestMapping("/")
public class CustomerController {

	/**
	 * Show customer form
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String toCustomerForm(ModelMap model) {
		model.addAttribute("customer", new Customer());
		return "add_customer";
	}

	/**
	 * Show customer
	 * 
	 * @param customer
	 * @return
	 */
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String showCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println("cust:" + customer.getFirstName());
		return "show_customer";
	}

	/**
	 * Get
	 * 
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String getCookie(@ModelAttribute("customer") Customer customer,
			final RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("customer", customer);
		redirectAttributes.addFlashAttribute("message", "Added successfully.");

		return "redirect:show";
	}
}
