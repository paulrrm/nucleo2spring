package com.uisrael.acme.model;

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
public class Producto implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProucto;
	private String nombreProducto;
	private String Descripcion;
	
	@OneToMany(mappedBy = "fkProducto")
	private List<DetallePedido> listaDPProducto = new ArrayList<>();
}
