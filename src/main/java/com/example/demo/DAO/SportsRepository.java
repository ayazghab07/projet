package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.Sports;

@Repository
public interface SportsRepository extends CrudRepository<Sports, Long> {

}
