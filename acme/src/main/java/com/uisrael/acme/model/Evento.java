package com.uisrael.acme.model;

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
public class Evento implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	private Date fechaEvento;
	private String estado;
	
	@OneToMany(mappedBy = "fkEvento")
	private List<DetallePedido> listaDPEvento = new ArrayList<>();
}
