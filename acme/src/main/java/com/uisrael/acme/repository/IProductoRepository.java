package com.uisrael.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.acme.model.Producto;


public interface IProductoRepository extends JpaRepository<Producto, Integer>{

	public Producto findById(int idProducto);
}
