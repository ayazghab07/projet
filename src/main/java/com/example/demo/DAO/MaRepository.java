package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ma;

@Repository
public interface MaRepository extends CrudRepository<Ma, String> {

}
