package ec.edu.itsqmet.manejo.escuela.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.itsqmet.manejo.escuela.model.Curso;
import ec.edu.itsqmet.manejo.escuela.service.ICursoService;

public class CursoServiceImpl {



    @Autowired
    ICursoService service;
    @Override
    public List<Curso> obtenerCursos() {
        // Implementación del método
        return service.findAll();
    }
    



}

   
