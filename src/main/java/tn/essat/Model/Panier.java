package tn.essat.Model;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private List<LignePanier> lignes;

	public Panier() {
		this.lignes = new ArrayList<LignePanier>();
	
	}

	public List<LignePanier> getLignes() {
		return lignes;
	}

	public void setLignes(List<LignePanier> lignes) {
		this.lignes = lignes;
	}
	
	


	
	
	
	
	

}
