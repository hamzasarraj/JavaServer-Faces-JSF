package com.formation.listener;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class MyActionListener implements ActionListener{

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException{
		System.out.println("Je suis dans MyActionListener");
		
	}
	
}
