package com.uisrael.acme.service;

import java.util.List;

import com.uisrael.acme.model.Cliente;


public interface IClienteService {

	public void insertarCliente(Cliente nuevo);
	public void actualizarCliente(Cliente elimina);
	public  List<Cliente> listar();
	public Cliente listarCliente(int id);
	public void eliminarCliente(int id);
	public List<Cliente> listarClientesActivos();
}
