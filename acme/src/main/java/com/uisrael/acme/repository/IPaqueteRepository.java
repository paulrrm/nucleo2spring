package com.uisrael.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.acme.model.Paquete;



public interface IPaqueteRepository extends JpaRepository<Paquete, Integer>{

	public Paquete findById(int idPaquete);
	
}
