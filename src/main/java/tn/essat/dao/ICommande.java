package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.Model.Commande;
@Repository
public interface ICommande extends JpaRepository<Commande, Integer>{

}
