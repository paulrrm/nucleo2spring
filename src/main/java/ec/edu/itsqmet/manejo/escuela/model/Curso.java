package ec.edu.itsqmet.manejo.escuela.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String cursoNombre;
    private int cursoCapacidad;

    @ManyToOne
    @JoinColumn(name =  "fkCursoProfe")
    Profesor fkprofesorc;

    @ManyToOne
    @JoinColumn(name =  "fkAulaCurso")
    Aula fkAulaCurso;

    @ManyToOne
    @JoinColumn(name =  "fkSemestre")
    Semestre fksemestre;
}
