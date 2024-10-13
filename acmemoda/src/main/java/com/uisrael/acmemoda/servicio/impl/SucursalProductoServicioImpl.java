package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.SucursalProducto;
import com.uisrael.acmemoda.repositorio.ISucursalProductoRepositorio;
import com.uisrael.acmemoda.servicio.ISucursalProductoServicio;

@Service
@Component
public class SucursalProductoServicioImpl implements ISucursalProductoServicio {

	@Autowired
	ISucursalProductoRepositorio sucursalProductoRepositorio;

	@Override
	public void insertarSucursalProducto(SucursalProducto nuevoSucursalProducto) {
		try {
			sucursalProductoRepositorio.save(nuevoSucursalProducto);
		} catch (Exception e) {
			System.out.print("Error al agregar nuevo Sucrusal x producto");
		}

	}

	@Override
	public void actualizarSucursalProducto(SucursalProducto editarSucursalProducto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SucursalProducto> listarSucursalProducto() {
		try {
			return sucursalProductoRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar las Sucursal x Productos");
			return null;
		}
	}
}
