package ec.edu.itsqmet.manejo.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.manejo.escuela.model.Curso;


public interface ICursoRepository  extends JpaRepository<Curso,Integer> {


}
