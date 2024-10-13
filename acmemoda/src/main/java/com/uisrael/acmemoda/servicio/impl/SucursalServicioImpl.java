package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.Sucursal;
import com.uisrael.acmemoda.repositorio.ISucursalRepositorio;
import com.uisrael.acmemoda.servicio.ISucursalServicio;

@Service
@Component
public class SucursalServicioImpl implements ISucursalServicio {

	@Autowired
	ISucursalRepositorio sucursalRepositorio;
	
	@Override
	public void insertarSucursal(Sucursal nuevoSucursal) {
		try {
			sucursalRepositorio.save(nuevoSucursal);
		} catch (Exception e) {
			System.out.print("Error al agregar nueva Sucursal");
		}
		
	}

	@Override
	public void actualizarSucursal(Sucursal editarSucursal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Sucursal> listarSucursal() {
		try {
			return sucursalRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar las Sucursales");
			return null;
		}
	}


	
	
	
}
