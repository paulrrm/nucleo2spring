package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.OrdenPedido;
import com.uisrael.acmemoda.repositorio.IOrdenPedidoRepositorio;
import com.uisrael.acmemoda.servicio.IOrdenPedidoServicio;

@Service
@Component
public class OrdenPedidoServicioImpl implements IOrdenPedidoServicio {

	@Autowired
	IOrdenPedidoRepositorio ordenPedidoRepositorio;

	@Override
	public void insertarOrdenPedido(OrdenPedido nuevoOrdenPedido) {
		try {
			ordenPedidoRepositorio.save(nuevoOrdenPedido);
		} catch (Exception e) {
			System.out.print("Error al agregar nuevo Orden x Pedido");
		}

	}

	@Override
	public void actualizarOrdenPedido(OrdenPedido editarOrdenPedido) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<OrdenPedido> listarOrdenPedido() {
		try {
			return ordenPedidoRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar Orden x Pedido");
			return null;
		}
	}

}
