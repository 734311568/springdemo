/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springdemo.model;

/**
 *
 * @author 73431
 */
public class User {

	private Integer id;
	private String userName;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{"
			+ "id=" + id
			+ ", userName='" + userName + '\''
			+ ", password='" + password + '\''
			+ '}';
	}
}
