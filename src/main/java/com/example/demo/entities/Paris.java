package com.example.demo.entities;




import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Paris {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  id;
   private Date date;
   private String pari_mise;
   private String pari_montant ;
  
 // @ManyToOne
  // @JsonBackReference
 //  private Parieur parieur;
}
