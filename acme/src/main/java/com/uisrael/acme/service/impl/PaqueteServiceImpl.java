package com.uisrael.acme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acme.model.Paquete;
import com.uisrael.acme.repository.IPaqueteRepository;
import com.uisrael.acme.service.IPaqueteService;
@Service
@Component
public class PaqueteServiceImpl implements IPaqueteService{
	@Autowired
	private IPaqueteRepository repo;
	@Override
	public void insertarPaquete(Paquete nuevo) {
		// TODO Auto-generated method stub
		repo.save(nuevo);
	}

	@Override
	public void actualizarPaquete(Paquete elimina) {
		// TODO Auto-generated method stub
		repo.save(elimina);
	}

	@Override
	public List<Paquete> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Paquete listarPaquete(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
