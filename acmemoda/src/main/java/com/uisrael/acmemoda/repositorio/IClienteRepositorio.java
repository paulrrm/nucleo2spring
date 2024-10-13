package com.uisrael.acmemoda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.acmemoda.modelo.Cliente;

public interface IClienteRepositorio extends JpaRepository<Cliente, Integer>{

	@Query("Select cli from Cliente cli where cli.idCliente=?1") //jpql
	public Cliente buscarClienteId(Integer id);
	//public List<Cliente> buscarNombre(String nombre);
	
}
