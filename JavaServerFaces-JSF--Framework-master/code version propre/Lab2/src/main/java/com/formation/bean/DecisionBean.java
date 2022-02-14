package com.formation.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class DecisionBean {

	public String calcul() {
		return Math.random() < 0.5 ? "success" : "echec";
	}
}
