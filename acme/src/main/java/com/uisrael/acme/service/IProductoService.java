package com.uisrael.acme.service;

import java.util.List;

import com.uisrael.acme.model.Producto;


public interface IProductoService {
	public void insertarProducto(Producto nuevo);
	public void actualizarProducto(Producto elimina);
	public  List<Producto> listar();
	public Producto listarProducto(int id);
}
