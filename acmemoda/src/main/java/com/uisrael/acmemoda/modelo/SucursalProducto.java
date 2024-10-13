package com.uisrael.acmemoda.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class SucursalProducto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursalProducto;
	@Temporal(TemporalType.DATE)
	private Date fechaPedido;
	@Temporal(TemporalType.DATE)
	private Date fechaEntrega;
	private Boolean estado;
	
	@OneToMany(mappedBy = "fkProductoSucursal")
	private List<Producto> listaProducto= new ArrayList<>();
	
	@ManyToOne
	@JoinColumn (name="idSucursal")
	private Sucursal fkSucursal;

}
