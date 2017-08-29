package com.hardik.springmvc.controller.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import com.hardik.springmvc.controller.view.Views;
import com.hardik.springmvc.model.User;

/**
 * User Response Body
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class UserResponse {

	@JsonView(Views.Public.class)
	public String code;
	@JsonView(Views.Public.class)
	public String message;
	@JsonView(Views.Public.class)
	public List<User> users;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
