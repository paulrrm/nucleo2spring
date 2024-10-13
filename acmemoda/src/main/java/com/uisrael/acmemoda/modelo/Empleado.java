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
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpleado;
	private String cedula;
	private String nombre;
	private Date edad;
	private String apellido;
	private String telefono;
	private String correo;
	private String puesto;
	
	@OneToMany(mappedBy = "fkEmpleado")
	private List<OrdenPedido> listaOrdenPedido= new ArrayList<>();
}
