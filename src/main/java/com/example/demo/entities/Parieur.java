package com.example.demo.entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Parieur{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String  nom;
	private String prenom;
	private Long  telephone;
	private String email;
	private String password;
	private String adresse;
	private Long code_postal;
	private String ville;
	private String montant;
	private String payer;
 //@ManyToOne
 //@JsonBackReference
 //private Paris nomParis;
 //@OneToMany(mappedBy = "parieur")
 //@JsonManagedReference
 
 //List<Match> paris = new ArrayList<>();
 
 
}