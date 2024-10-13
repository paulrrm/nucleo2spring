package com.uisrael.acme.service;

import java.util.List;

import com.uisrael.acme.model.Paquete;

public interface IPaqueteService {


	public void insertarPaquete(Paquete nuevo);
	public void actualizarPaquete(Paquete elimina);
	public  List<Paquete> listar();
	public Paquete listarPaquete(int id);
}
