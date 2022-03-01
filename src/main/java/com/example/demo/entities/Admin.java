package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Admin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String nom;
   private String prenom;
   private int telephone;
   private String email;
   private String password;
}
