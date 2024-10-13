package com.uisrael.acmemoda.servicio;

import java.util.List;

import com.uisrael.acmemoda.modelo.SucursalProducto;

public interface ISucursalProductoServicio {

	public void insertarSucursalProducto(SucursalProducto nuevoSucursalProducto);

	public void actualizarSucursalProducto(SucursalProducto editarSucursalProducto);

	public List<SucursalProducto> listarSucursalProducto();
}
