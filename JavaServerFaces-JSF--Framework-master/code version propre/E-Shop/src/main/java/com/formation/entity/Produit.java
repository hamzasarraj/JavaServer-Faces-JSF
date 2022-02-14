package com.formation.entity;

import java.io.Serializable;

public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
    private String label;
    private String description;
    private Double price;
    
    
    // Get+ Set+ constructor +toString
    
    public Produit() {
    }

    
    public Produit(int id, String label, String description, Double price) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
		this.price = price;
	}


	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", label=" + label + ", description="
				+ description + ", price=" + price + "]";
	}

}
