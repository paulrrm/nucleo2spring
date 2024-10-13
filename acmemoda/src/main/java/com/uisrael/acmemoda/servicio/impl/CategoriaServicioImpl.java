package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.Categoria;
import com.uisrael.acmemoda.repositorio.ICategoriaRepositorio;
import com.uisrael.acmemoda.servicio.ICategoriaServicio;

@Service
@Component
public class CategoriaServicioImpl implements ICategoriaServicio {

	@Autowired
	ICategoriaRepositorio categoriaRepositorio;

	@Override
	public void insertarCategoria(Categoria nuevoCategoria) {
		try {
			categoriaRepositorio.save(nuevoCategoria);
		} catch (Exception e) {
			System.out.print("Error al agregar nueva categoria");
		}

	}

	@Override
	public void actualizarTallas(Categoria editarCategoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Categoria> listarCategoria() {
		try {
			return categoriaRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar categorias");
			return null;
		}
	}

}
