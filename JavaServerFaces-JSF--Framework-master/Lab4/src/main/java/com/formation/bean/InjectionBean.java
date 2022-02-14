package com.formation.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@SessionScoped
@SuppressWarnings("serial")
public class InjectionBean implements Serializable {
	@Inject
	private CalculateurBean calculateurBean;
	public void setCalculateurBean(CalculateurBean calculateurBean) {
		this.calculateurBean = calculateurBean;
	}
	private int number1;
	private int number2;
	private String result;

	public String calcul() {
		result = calculateurBean.getMsg() + calculateurBean.add(number1, number2);
		return result;
	}



	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public String getResult() {return result;}
}
