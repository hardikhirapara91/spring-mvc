package com.hardik.springmvc.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.hardik.springmvc.controller.view.Views;

/**
 * USER
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class User {

	@JsonView(Views.Public.class)
	private String username;
	private String password;
	@JsonView(Views.Public.class)
	private String firstName;
	@JsonView(Views.Public.class)
	private String lastName;

	public User() {
	}

	public User(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
