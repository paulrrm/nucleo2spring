package ec.edu.itsqmet.manejo.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.manejo.escuela.model.Profesor;

public interface IProfesorRepository  extends JpaRepository<Profesor, Integer> {

}
