package com.uisrael.acme.model;

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
public class DetallePedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetallePedido;
	
	@ManyToOne
	@JoinColumn(name="fkProducto")
	private Producto fkProducto;
	@ManyToOne
	@JoinColumn(name="fkEvento")
	private Evento fkEvento;
	@ManyToOne
	@JoinColumn(name="fkPaquete")
	private Paquete fkPaquete;
	@ManyToOne
	@JoinColumn(name="fkCliente")
	private Cliente fkCliente;
}
