package ec.edu.itsqmet.manejo.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.manejo.escuela.model.Estudiante;

public interface IEstudianteRepository  extends JpaRepository< Estudiante, Integer > {

}
