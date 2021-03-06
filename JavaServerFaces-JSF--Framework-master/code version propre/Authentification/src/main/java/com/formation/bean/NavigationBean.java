package com.formation.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class NavigationBean implements Serializable {
 
	  private static final long serialVersionUID = 1520318172495977648L;
	  
	    /**
	     * Redirect to login page.
	     */
	    public String redirectToLogin() {
	        return "/index.xhtml";
	    }
	     
	    /**
	     * Go to login page.
	     */
	    public String toLogin() {
	        return "/index.xhtml";
	    }
	     
	    /**
	     * Redirect to info page.
	     */
	    public String redirectToInfo() {
	        return "/public/info.xhtml";
	    }
	     
	    /**
	     * Go to info page.
	     */
	    public String toInfo() {
	        return "/public/info.xhtml";
	    }
	     
	    /**
	     * Redirect to welcome page.
	     */
	    public String redirectToWelcome() {
	        return "/secured/welcome.xhtml?faces-redirect=true";
	    }
	     
	    /**
	     * Go to welcome page.
	     */
	    public String toWelcome() {
	        return "/secured/welcome.xhtml";
	    }
}
