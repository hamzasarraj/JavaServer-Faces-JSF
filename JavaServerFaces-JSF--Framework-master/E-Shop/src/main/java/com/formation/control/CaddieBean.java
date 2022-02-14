package com.formation.control;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.formation.domaine.ShoppingCart;
import com.formation.entity.Produit;

@Named("caddie")
@SessionScoped
public class CaddieBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private ShoppingCart shoppingCart;

	@PostConstruct
	public void init() {
		shoppingCart = new ShoppingCart();
	}

	public boolean isVide() {
		return (shoppingCart.getNumberOfItems() <= 0 ? false : true);
	}

	public void ajouter(Produit product) {
		shoppingCart.addItem(product);
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
