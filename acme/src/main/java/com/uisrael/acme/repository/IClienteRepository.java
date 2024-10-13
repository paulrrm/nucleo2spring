package com.uisrael.acme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.acme.model.Cliente;

import jakarta.transaction.Transactional;


public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

	
	public Cliente findById(int idCliente);
	@Transactional
    @Modifying
    @Query("UPDATE Cliente c SET c.estadoCliente = false WHERE c.idCliente = ?1")
	public void eliminar(int idCliente);
	
	@Transactional
	@Query("Select cti from Cliente cti where cti.estadoCliente= true")
	public List<Cliente> listadosActivas();
}
