package com.formation.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "attrib")
public class AttributBean {

	public String buttonId;
	
	public void affiche(ActionEvent event) {
		
		//on obtient ici l'id du composant
		buttonId = event.getComponent().getClientId();
		
		System.out.println("Réaction du listener afficher " + buttonId);
	}
	
	public String navigation() {
		System.out.println("Dans la méthode métier + navigation");
		return "result";
	}
}
