package com.uisrael.acmemoda.servicio;

import java.util.List;

import com.uisrael.acmemoda.modelo.Empleado;

public interface IEmpleadoServicio {

	public void insertarEmpleado(Empleado nuevoEmpleado);

	public void actualizarEmpleado(Empleado editarEmpleado);

	public List<Empleado> listarEmpleado();

}
