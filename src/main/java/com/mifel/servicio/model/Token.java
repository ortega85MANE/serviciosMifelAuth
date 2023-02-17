package com.mifel.servicio.model;

public class Token {
	
	private String token;
	private String userName;
	private Long id;
	private String role;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Token(String token, String userName, Long id, String role) {
		this.token = token;
		this.userName = userName;
		this.id = id;
		this.role = role;
	}
	public Token() {
		super();
	}
	
}
