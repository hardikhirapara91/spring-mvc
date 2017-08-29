package com.hardik.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.hardik.springmvc.controller.request.UserRequest;
import com.hardik.springmvc.controller.response.UserResponse;
import com.hardik.springmvc.controller.view.Views;
import com.hardik.springmvc.model.User;

/**
 * User Controller
 * 
 * @author HARDIK HIRAPARA
 *
 */
@RestController
public class UserController {

	List<User> users;

	/**
	 * Show Users
	 * 
	 * @return
	 */
	@JsonView(Views.Public.class)
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public UserResponse getUsers() {
		UserResponse response = new UserResponse();

		response.setCode("200");
		response.setMessage("success");
		response.setUsers(users);

		// AjaxResponseBody will be converted into json format and send back to
		// the request.
		return response;
	}

	/**
	 * Search Users
	 * 
	 * @return
	 */
	@JsonView(Views.Public.class)
	@RequestMapping(value = "/users/search", method = RequestMethod.POST)
	public UserResponse searchUsers(@RequestBody UserRequest request) {
		UserResponse response = new UserResponse();

		// Validate Request
		if (validateUserRequest(request)) {

			List<User> result = searchUserByUsername(request.getUsername());
			if (!result.isEmpty()) {
				response.setCode("200");
				response.setMessage("success");
				response.setUsers(result);
			} else {
				response.setCode("204");
				response.setMessage("No user");
			}
		} else {
			response.setCode("400");
			response.setMessage("Search criateria is empty!");
		}

		// AjaxResponseBody will be converted into json format and send back to
		// the request.
		return response;
	}

	// #############################
	// PRIVATE METHODS
	// #############################

	/**
	 * Set Users
	 */
	@PostConstruct
	public void setUsers() {
		users = new ArrayList<>();
		users.add(new User("AAA", "BBB", "CCC", "DDD"));
		users.add(new User("EEE", "FFF", "GGG", "HHH"));
		users.add(new User("III", "JJJ", "KKK", "LLL"));
	}

	/**
	 * Validate User Request
	 * 
	 * @param request
	 * @return
	 */
	private boolean validateUserRequest(UserRequest request) {
		if (request == null) {
			return false;
		}
		if (StringUtils.isEmpty(request.getUsername())) {
			return false;
		}
		return true;
	}

	/**
	 * Search User by Username
	 * 
	 * @return
	 */
	public List<User> searchUserByUsername(String username) {
		List<User> result = new ArrayList<>();
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				result.add(user);
			}
		}
		return result;
	}
}
