package com.uisrael.acmemoda.servicio;

import java.util.List;

import com.uisrael.acmemoda.modelo.Cliente;

public interface IClienteServicio {
	
	public void insertarCliente(Cliente nuevoCliente);

	public void actualizarCliente(Cliente editarCliente);

	public List<Cliente> listarCliente();

	public Cliente buscarClienteId(Integer id);

	//public List<Cliente> buscarNombre(String nombre);
}
