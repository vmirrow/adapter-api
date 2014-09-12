package com.dell.dsg.adapter.k1000.domain;


public class Login {
	private String name;
	private String password;
	
	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
