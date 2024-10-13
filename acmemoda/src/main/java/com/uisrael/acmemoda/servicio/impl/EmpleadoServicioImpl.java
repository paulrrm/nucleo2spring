package com.uisrael.acmemoda.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acmemoda.modelo.Empleado;
import com.uisrael.acmemoda.repositorio.IEmpleadoRepositorio;
import com.uisrael.acmemoda.servicio.IEmpleadoServicio;

@Service
@Component
public class EmpleadoServicioImpl implements IEmpleadoServicio {
	
	@Autowired
	IEmpleadoRepositorio empleadoRepositorio;

	@Override
	public void insertarEmpleado(Empleado nuevoEmpleado) {
		try {
			empleadoRepositorio.save(nuevoEmpleado);
		} catch (Exception e) {
			System.out.print("Error al agregar nuevo empleado");
		}
		
	}

	@Override
	public void actualizarEmpleado(Empleado editarEmpleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empleado> listarEmpleado() {
		try {
			return empleadoRepositorio.findAll();
		} catch (Exception e) {
			System.out.print("Error al listar empleados");
			return null;
		}
	}

}
