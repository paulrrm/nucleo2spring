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
public class Sucursal implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;
	private String nombre;
	private String direccion;
	private String provincia;
	private String ciudad;
	private String telefono;
	private String correo;
	
	@OneToMany(mappedBy = "idSucursal")
	private List<Sucursal> listaSucursal= new ArrayList<>();
	
}
