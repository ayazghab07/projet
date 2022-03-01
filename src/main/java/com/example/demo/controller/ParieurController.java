package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.ParieurRepository;
import com.example.demo.entities.Parieur;
import com.example.demo.service.ParieurService;


@CrossOrigin("*")
@RestController
@RequestMapping("/app")
public class ParieurController {

	 @Autowired
	 private ParieurService parieurService;
	 @Autowired
	 private ParieurRepository parieurRepository;
	 
	 @GetMapping("/parieur")
	 public Iterable<Parieur> getParieur(){
		 return parieurService.getParieur();
	 }
	 @PostMapping(path = "/addparieur")
	 public void addParieur(@RequestBody Parieur P) {
		 parieurService.saveParieur(P);
	        System.out.println("connexion au controleur reussi");
	 }
	 @DeleteMapping("/empl/{id}")
	  public void deleteTutorial(@org.springframework.web.bind.annotation.PathVariable("id") Long id) {
		 parieurRepository.deleteById(id);
	  }
    // @PutMapping("/empl/{id}")
    // public Employee  update(@PathVariable Long id, @RequestBody Employee empl) {
    //	 Employee employee = employeeRepository.findById(id).orElse(null);
    //	 employee.setNom(empl.getNom ());
    	// employee.setPrenom(empl.getPrenom());
    //	 employee.setGrade(empl.getGrade());
    	
    	// Employee  updatempl = employeeRepository.save(employee);
    	// return updatempl;
    	 
     }

