package com.uisrael.acmemoda.servicio;

import java.util.List;

import com.uisrael.acmemoda.modelo.Sucursal;

public interface ISucursalServicio {

	public void insertarSucursal(Sucursal nuevoSucursal);

	public void actualizarSucursal(Sucursal editarSucursal);

	public List<Sucursal> listarSucursal();

}
