package com.uisrael.acmemoda.servicio;

import java.util.List;

import com.uisrael.acmemoda.modelo.OrdenPedido;

public interface IOrdenPedidoServicio {

	public void insertarOrdenPedido(OrdenPedido nuevoOrdenPedido);

	public void actualizarOrdenPedido(OrdenPedido editarOrdenPedido);

	public List<OrdenPedido> listarOrdenPedido();

}
