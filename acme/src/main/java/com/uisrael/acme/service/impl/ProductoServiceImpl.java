package com.uisrael.acme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acme.model.Producto;
import com.uisrael.acme.repository.IProductoRepository;
import com.uisrael.acme.service.IProductoService;
@Service
@Component
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoRepository repo;
	@Override
	public void insertarProducto(Producto nuevo) {
		// TODO Auto-generated method stub
		repo.save(nuevo);
	}

	@Override
	public void actualizarProducto(Producto elimina) {
		// TODO Auto-generated method stub
		repo.save(elimina);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Producto listarProducto(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
