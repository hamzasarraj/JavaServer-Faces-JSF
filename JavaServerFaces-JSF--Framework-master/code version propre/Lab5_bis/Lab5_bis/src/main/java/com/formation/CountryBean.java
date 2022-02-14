package com.formation;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named("country")
@SessionScoped
public class CountryBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Map<String, String> countries;
	
	//default value
	private String localCode = "fr";
	
	static {
		countries = new LinkedHashMap<String, String>();
		countries.put("Angleterre", "en");
		countries.put("France", "fr");
		countries.put("Allemagne", "de");
	}

	public Map<String, String> getCountryInMap(){
		return this.countries;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	//permet de changer le code local en fonction du choix de la langue
	public void changerCodeLocalPays(ValueChangeEvent event) throws AbortProcessingException {
		FacesContext context = FacesContext.getCurrentInstance();
		System.out.println("Changmemt de la langue : " + event.getNewValue());
		String langue = (String) event.getNewValue();
		if(countries.containsKey(langue)) {
			String code = countries.get(langue);
			if(code.equals("en")) {
				context.getViewRoot().setLocale(Locale.ENGLISH);
				System.out.println("Vous avez sélectionné la langue : " + langue);
			}
			if(code.equals("fr")) {
				context.getViewRoot().setLocale(Locale.FRENCH);
				System.out.println("Vous avez sélectionné la langue : " + langue);
			}
			if(code.equals("de")) {
				context.getViewRoot().setLocale(Locale.GERMAN);
				System.out.println("Vous avez sélectionné la langue : " + langue);
			}
		} else {
			context.getViewRoot().setLocale(Locale.ENGLISH);
		}
		//assign new value to localeCode
		localCode=event.getNewValue().toString();
	}
	
	
}
