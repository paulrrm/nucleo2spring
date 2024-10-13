package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.Pedido;
import com.uisrael.acmemoda.repositorio.IPedidoRepositorio;
import com.uisrael.acmemoda.servicio.IPedidoServicio;

@Service
@Component
public class PedidoServicioImpl implements IPedidoServicio {

	@Autowired
	IPedidoRepositorio pedidoRepositorio;

	@Override
	public void insertarPedido(Pedido nuevoPedido) {
		try {
			pedidoRepositorio.save(nuevoPedido);
		} catch (Exception e) {
			System.out.print("Error al agregar nuevo Pedido");
		}

	}

	@Override
	public void actualizarPedido(Pedido editarPedido) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pedido> listarPedido() {
		try {
			return pedidoRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar los Pedido");
			return null;
		}
	}

}
