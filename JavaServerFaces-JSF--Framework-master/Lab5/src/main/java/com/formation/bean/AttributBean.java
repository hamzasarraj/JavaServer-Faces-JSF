package com.formation.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "attrib")
public class AttributBean {
public String buttonId;
public void affiche( ActionEvent event) {
	buttonId = event.getComponent().getClientId();
	System.out.println("Reaction du listener affiche " + buttonId);
}
public String navigation() {
	System.out.println("Dans la méthode metier + navigation");
	return "result";
}
}
