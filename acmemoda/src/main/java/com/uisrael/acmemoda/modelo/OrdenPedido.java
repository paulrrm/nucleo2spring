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
import lombok.Data;

@Data
@Entity
public class OrdenPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrdenPedido;
	private Date fechaPedido;
	private Boolean estado;

	@OneToMany(mappedBy = "fkProductoOrdenPedido")
	private List<Producto> listaProducto = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	private Empleado fkEmpleado;

	@ManyToOne
	@JoinColumn(name = "idPedido")
	private OrdenPedido fkPedido;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private OrdenPedido fkCliente;
}
