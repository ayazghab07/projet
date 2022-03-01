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
@Entity@Data@AllArgsConstructor@NoArgsConstructor@ToString
public class Ma {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
private String nom;
private Date date_debut;
private Date date_fin;
}
