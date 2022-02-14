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
public class CountryBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Map<String, String> countries;
	private String localeCode = "fr";
	static {
		countries = new LinkedHashMap<String, String>();
		countries.put("Angleterre", "en");
		countries.put("Allemagne", "de");
		countries.put("France", "fr");

	}
public Map<String, String> getCountryInMap(){
	return  CountryBean.countries;
}
	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public void changeCodeLocalePays(ValueChangeEvent event) throws AbortProcessingException {
		FacesContext context = FacesContext.getCurrentInstance();
		System.out.println("Changement de la langue : " + event.getNewValue());
		String langue = (String) event.getNewValue();
			
			String code = countries.get(langue);
			if(code.equals("en")) {context.getViewRoot().setLocale(Locale.ENGLISH);
			System.out.println("vous avez sélectionnez la langue: " + langue);}
			if(code.equals("fr")) {context.getViewRoot().setLocale(Locale.FRANCE);
			System.out.println("vous avez sélectionnez la langue: " + langue);}
			if(code.equals("de")) {context.getViewRoot().setLocale(Locale.GERMAN);
			System.out.println("vous avez sélectionnez la langue: " + langue);}
			else {
				context.getViewRoot().setLocale(Locale.ENGLISH);
			}
			//assign new value to localCode
			localeCode = event.getNewValue().toString();
			
		}
	}

