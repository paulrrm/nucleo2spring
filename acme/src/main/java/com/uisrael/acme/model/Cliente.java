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
public class Cliente implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	private String nombreCliente;
	private String correoCliente;
	private String telefono;
	private boolean estadoCliente;
	
	@OneToMany(mappedBy = "fkCliente")
	private List<DetallePedido> listaDPCliente = new ArrayList<>();
}