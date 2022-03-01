package com.example.demo.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Sports {
	@Id
  private Long id;
  private String nom;
  private String type;
 
  //@OneToMany(mappedBy = "nomUnite")
	//@JsonManagedReference
	//List<Employee> users = new ArrayList<>();
}
