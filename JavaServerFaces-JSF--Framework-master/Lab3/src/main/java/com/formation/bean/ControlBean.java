package com.formation.bean;

import javax.faces.bean.ManagedBean;

import com.formation.domain.Customer;
import com.formation.service.CustomerService;
import com.formation.service.CustomerServiceImpl;

@ManagedBean(name = "BDD")
public class ControlBean {
private String customerId;
private String password;
private Customer customer;
private static CustomerService lookupService = new CustomerServiceImpl();
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId.trim();
	if(this.customerId.isEmpty()) {
		this.customerId = "(none enered)";
	}
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Customer getCustomer() {
	return customer;
}

public String showBalance() {
	if(!password.equals("secret")) {
		return ("wrong-password");
	}
	customer = lookupService.findCustomer(customerId);
	if(customer == null) {return ("unknow-customer");}
	else if (customer.getBalance() < 0) {return ("negative-balance");}
	else if (customer.getBalance() > 10000) {return ("normal-balance");}
	else {return ("high-balance");}

	}
}

