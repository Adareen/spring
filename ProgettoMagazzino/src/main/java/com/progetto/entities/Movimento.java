package com.progetto.entities;

import java.time.LocalDate;
import java.util.Set;

import org.hibernate.annotations.CascadeType;
import org.hibernate.query.sqm.FetchClauseType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="movimento_magazzino")
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prodotto", referencedColumnName = "id", nullable = false)
    private Prodotto prodotto;

    private int entrate;
    private int uscite;

    private LocalDate data;
	
	
	
//	@Id
//	
//	//@JoinColumn(table = "Prodotti_magazzino", referencedColumnName = "id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id; 
//	
////	@ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "id_prodotto")
//	@ManyToOne
//    private Prodotto prodotto; 
//    
//    
//	private int entrate;
//	private int uscite;
//	
//	private LocalDate data;
//	
//	
	
	public int getEntrate() {
		return entrate;
	}
	public void setEntrate(int entrate) {
		this.entrate = entrate;
	}
	public int getUscite() {
		return uscite;
	}
	public void setUscite(int uscite) {
		this.uscite = uscite;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	
}
