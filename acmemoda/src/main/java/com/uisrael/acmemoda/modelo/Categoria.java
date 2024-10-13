package com.uisrael.acmemoda.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdCategoria;
	private String nombre;
	private String descripcion;
	private String tipo;
	private boolean estado;
	
	@OneToMany(mappedBy = "fkProductoCategoria")
	private List<Producto> listaProducto= new ArrayList<>();
	
}