package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad,Integer> {
	
	List<Ciudad> findByPaisId(int id);
}
