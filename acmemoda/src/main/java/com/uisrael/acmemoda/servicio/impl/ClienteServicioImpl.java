package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.Cliente;
import com.uisrael.acmemoda.repositorio.IClienteRepositorio;
import com.uisrael.acmemoda.servicio.IClienteServicio;

@Service
@Component
public class ClienteServicioImpl implements IClienteServicio {

	@Autowired
	IClienteRepositorio clienteRepositorio;

	@Override
	public void insertarCliente(Cliente nuevoCliente) {
		try {
			clienteRepositorio.save(nuevoCliente);
		} catch (Exception e) {
			System.out.print("Error al agregar nuevo cliente");
		}

	}

	@Override
	public void actualizarCliente(Cliente editarCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listarCliente() {
		try {
			return clienteRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar clientes");
			return null;
		}
	}

	@Override
	public Cliente buscarClienteId(Integer id) {
		try {
			return clienteRepositorio.buscarClienteId(id);
		} catch (Exception e) {
			System.out.print("Error al buscar cliente por ID");
			return null;
		}
	}

/*	@Override
	public List<Cliente> buscarNombre(String nombre) {
		try {
			return clienteRepositorio.buscarNombre(nombre);
		} catch (Exception e) {
			System.out.print("Error al buscar cliente por ID");
			return null;
		}
	}*/
}
