package ec.edu.itsqmet.manejo.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.manejo.escuela.model.Matricula;

public interface IMatriculaRepository  extends JpaRepository<Matricula,Integer> {
    

}
