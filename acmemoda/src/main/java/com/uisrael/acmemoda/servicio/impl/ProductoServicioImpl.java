package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.Producto;
import com.uisrael.acmemoda.repositorio.IProductoRepositorio;
import com.uisrael.acmemoda.servicio.IProductoServicio;

@Service
@Component
public class ProductoServicioImpl implements IProductoServicio{

	@Autowired
	IProductoRepositorio productoRepositorio;
	
	@Override
	public void insertarProducto(Producto nuevoProducto) {
		try {
			productoRepositorio.save(nuevoProducto);
		} catch (Exception e) {
			System.out.print("Error al agregar nuevo Producto");
		}
		
	}

	@Override
	public void actualizarProducto(Producto editarProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> listarProducto() {
		try {
			return productoRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar los Productos");
			return null;
		}
	}

}
