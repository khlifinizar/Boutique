package tn.essat.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne @JoinColumn(name = "prod_id " )
	private Produit prod;
	private int quantite;
	@ManyToOne @JoinColumn(name = "cde_id " )
	private Commande cde;
	
	
	
	public LigneCommande(Produit prod, int quantite) {
		super();
		this.prod = prod;
		this.quantite = quantite;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produit getProd() {
		return prod;
	}

	public void setProd(Produit prod) {
		this.prod = prod;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Commande getCde() {
		return cde;
	}

	public void setCde(Commande cde) {
		this.cde = cde;
	}
	
	
	

}
