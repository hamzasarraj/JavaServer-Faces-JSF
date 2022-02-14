package com.formation.bean;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "loginBean")
public class LoginBean {
	private String name;
	private String password;
	public LoginBean() {
		super();
	}
	public LoginBean(String name, String password) {
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
