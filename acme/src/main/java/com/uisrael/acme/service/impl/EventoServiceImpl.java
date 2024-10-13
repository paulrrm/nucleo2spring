package com.uisrael.acme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acme.model.Evento;
import com.uisrael.acme.repository.IEventoRepository;
import com.uisrael.acme.service.IEventoService;
@Service
@Component
public class EventoServiceImpl implements IEventoService{
	@Autowired
	private IEventoRepository repo;
	@Override
	public void insertarEvento(Evento nuevo) {
		// TODO Auto-generated method stub
		repo.save(nuevo);
	}

	@Override
	public void actualizarEvento(Evento elimina) {
		// TODO Auto-generated method stub
		repo.save(elimina);
	}

	@Override
	public List<Evento> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Evento listar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repo.suspenderEvento(id);
	}

	@Override
	public List<Evento> listarActivos() {
		// TODO Auto-generated method stub
		return repo.listadoActivas();
	}

}
