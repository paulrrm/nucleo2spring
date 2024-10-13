package com.uisrael.acmemoda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.acmemoda.modelo.Empleado;

public interface IEmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
