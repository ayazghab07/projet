package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.gestionnaire_contennu;

@Repository
public interface GestionnaireRepository extends CrudRepository<gestionnaire_contennu, Long> {

}
