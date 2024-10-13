package com.uisrael.acmemoda.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	private String nombre;
	private String talla;
	private String color;
	private Double precio;
	private int stock;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn (name="idProductoCategoria")
	private Categoria fkProductoCategoria;
	
	@ManyToOne
	@JoinColumn (name="idProductoSucursal")
	private SucursalProducto fkProductoSucursal;
	
	@ManyToOne
	@JoinColumn (name="idProductoOrdenPedido")
	private OrdenPedido fkProductoOrdenPedido;
	
}
