package com.mifel.servicio.model;

public class JwtUser {

	private String userName;
	private long id;
	private String role;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setRole(String role) {
		this.role = role;	
	}

	public String getUserName() {
		return userName;
	}

	public String getRole() {
		return role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


}
