package ec.edu.itsqmet.manejo.escuela.service;

import java.util.List;

import ec.edu.itsqmet.manejo.escuela.model.Semestre;

public interface ISemestreService {

    // TODO: implementar métodos para administrar los semestres
    // CRUD (Create, Read, Update, Delete)
    public void create(Semestre semestre);
    public void update(Semestre semestre);
    public void delete(Integer idSemestre);
    public List<Semestre> read();
}


