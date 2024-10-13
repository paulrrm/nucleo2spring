package com.uisrael.acme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acme.model.Cliente;
import com.uisrael.acme.repository.IClienteRepository;
import com.uisrael.acme.service.IClienteService;
@Service
@Component
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteRepository repo;
	@Override
	public void insertarCliente(Cliente nuevo) {
		// TODO Auto-generated method stub
		repo.save(nuevo);
	}

	@Override
	public void actualizarCliente(Cliente elimina) {
		// TODO Auto-generated method stub
		repo.save(elimina);
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cliente listarCliente(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void eliminarCliente(int id) {
		// TODO Auto-generated method stub
		repo.eliminar(id);
	}

	@Override
	public List<Cliente> listarClientesActivos() {
		// TODO Auto-generated method stub
		return repo.listadosActivas();
	}

}
