package ec.edu.itsqmet.manejo.escuela.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ec.edu.itsqmet.manejo.escuela.model.Profesor;
import ec.edu.itsqmet.manejo.escuela.repository.IProfesorRepository;
import ec.edu.itsqmet.manejo.escuela.service.IProfesorService;

@Service
@Component
public class ProfesorServiceImpl implements IProfesorService{

    
    @Autowired
    IProfesorRepository iProfesorRepository;

    @Override
    public void insertProfesor(Profesor profesor) {
        
        iProfesorRepository.save(profesor);  // Se guarda en la base de datos el profesor
        System.out.println("Creando profesor...");

    }
    
}
