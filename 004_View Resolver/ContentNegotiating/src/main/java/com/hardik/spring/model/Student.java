package com.hardik.spring.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Student Model
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	@Size(min = 3, max = 25)
	private String firstName;
	@Size(min = 3, max = 25)
	private String lastName;
	@NotEmpty
	private String sex;
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	@NotNull
	@Email
	private String email;
	@NotEmpty
	private String section;
	@NotEmpty
	private String country;

	private boolean firstAttempt;

	@NotEmpty
	private List<String> subjects = new ArrayList<String>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isFirstAttempt() {
		return firstAttempt;
	}

	public void setFirstAttempt(boolean firstAttempt) {
		this.firstAttempt = firstAttempt;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", sex="
				+ getSex() + ", dob=" + getDob() + ", email=" + getEmail() + ", section=" + getSection() + ", country="
				+ getCountry() + ", firstAttempt=" + isFirstAttempt() + ", subjects=" + getSubjects() + "]";
	}
}