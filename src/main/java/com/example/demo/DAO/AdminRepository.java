package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>{

}
