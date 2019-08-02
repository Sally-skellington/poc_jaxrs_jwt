package com.jaxrs.security.jwt.model;

/**
 * The User Model
 * @author cmichaud
 *
 */
public class User {
	
	private String login;
	private String password;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
