package com.uisrael.acme.service;

import java.util.List;

import com.uisrael.acme.model.Evento;

public interface IEventoService {

	public void insertarEvento(Evento nuevo);
	public void actualizarEvento(Evento elimina);
	public  List<Evento> listar();
	public Evento listar(int id);
	public void eliminar(int id);
	public List<Evento> listarActivos();
}
