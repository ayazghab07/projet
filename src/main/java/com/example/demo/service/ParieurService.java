package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.ParieurRepository;
import com.example.demo.entities.Parieur;

import lombok.Data;

@Service
@Data
public class ParieurService {
	
	
	@Autowired
	private ParieurRepository parieurRepository;
	
	public Iterable<Parieur> getParieur(){
		return parieurRepository.findAll();
		
	}
	
	
	public Parieur saveParieur(Parieur P) {
        Parieur saveParieur = parieurRepository.save(P);
        System.out.println("Test Ervice");   
        return saveParieur;
    }
	/*
	 * public Employee deleteEmployee(Employee employee) { Employee deleteEmployee =
	 * employeeRepository. return deleteEmployee; }
	 */
	
//	public Employee Updateemp(Employee employee, long matricule) {
//		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
//			() -> new  ResourceNotFoundException("Employee", matricule));
//		existingEmployee.setMatricule(employee.getMatricule());
//		existingEmployee.setNom(employee.getNom());
//		existingEmployee.setPrenom(employee.getPrenom());
//		existingEmployee.setGrade(employee.getGrade());
//		employeeRepository.save(existingEmployee);
//		return existingEmployee;
//	}
	
	
}
