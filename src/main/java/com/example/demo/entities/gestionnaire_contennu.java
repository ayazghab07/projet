package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class gestionnaire_contennu {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nom;
   private  String prenom;
   private int telephone;
   private String email;
   private String password;
   
}
