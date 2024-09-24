package ec.edu.itsqmet.manejo.escuela.service;

import java.util.List;

import ec.edu.itsqmet.manejo.escuela.model.Curso;
import ec.edu.itsqmet.manejo.escuela.model.Profesor;

public interface ICursoService {

    public void insert(Curso curso);
    public void update(Curso curso); 
    public void delete(Integer id); 
    public Curso findById(Integer id);
    public List<Curso> findAll();
}
