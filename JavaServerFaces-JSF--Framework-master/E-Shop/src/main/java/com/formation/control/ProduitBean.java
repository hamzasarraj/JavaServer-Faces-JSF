package com.formation.control;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.formation.business.ProduitFacade;
import com.formation.entity.Produit;

@Named
@RequestScoped
public class ProduitBean {

	@Inject
	private ProduitFacade produitFacade;

	public List<Produit>  getProduitList() {
		return produitFacade.findProduits();
	}

	public void setProduitFacade(ProduitFacade produitFacade) {
		this.produitFacade = produitFacade;
	}
	

}
