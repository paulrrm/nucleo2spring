package ec.edu.itsqmet.manejo.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.manejo.escuela.model.Semestre;

public interface ISemestreRepository extends JpaRepository<Semestre , Integer> {

}
