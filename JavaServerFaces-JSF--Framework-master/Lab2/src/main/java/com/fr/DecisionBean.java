package com.fr;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "db")
public class DecisionBean {


public String calcul() {
	return Math.random() < 0.2 ? "success" : "echec";
}
}
