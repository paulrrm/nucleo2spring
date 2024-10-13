package com.uisrael.acme.service;

import java.util.List;

import com.uisrael.acme.model.DetallePedido;

public interface IDetallePedidoService {

	public void insertar(DetallePedido nuevo);
	public void actualizar(DetallePedido elimina);
	public void eliminar(int elimina);
	public  List<DetallePedido> listar();
}
