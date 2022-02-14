package com.formation.domaine;

import com.formation.entity.Produit;

public class LineCart {
	Produit product;
	short quantity;

	public LineCart(Produit product) {
		this.product = product;
		quantity = 1;
	}

	public Produit getProduct() {
		return product;
	}

	public void setProduct(Produit product) {
		this.product = product;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public void decrementQuantity() {
		quantity--;
	}

	public void incrementQuantity() {
		quantity++;
	}

	public double getTotal() {
		double amount = 0;
		amount = (this.getQuantity() * product.getPrice().doubleValue());
		return amount;
	}
}
