package com.uisrael.acmemoda.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String direccion;
	private Date edad;

	@OneToMany(mappedBy = "idCliente")
	private List<Cliente> listaCliente = new ArrayList<>();

}
