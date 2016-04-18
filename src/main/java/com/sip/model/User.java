package com.sip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	@JsonProperty
	private int userId;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String email;
	
	public User() {
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
