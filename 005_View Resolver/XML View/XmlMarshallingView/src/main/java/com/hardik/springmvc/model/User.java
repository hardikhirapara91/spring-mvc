package com.hardik.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User
 * 
 * @author HARDIK HIRAPARA
 *
 */
@XmlRootElement(name = "user")
public class User {

	private Integer id;
	private String firstName;
	private String lastName;

	public User() {
	}

	public User(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	@XmlElement(name = "id")
	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement(name = "firstname")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement(name = "lastname")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
