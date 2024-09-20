package ec.edu.itsqmet.manejo.escuela.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Matricula implements Serializable  {
    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    private Date fechaMatricula;
    private String semestreMatricula;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "fkMatEst")
    private Estudiante fkMatricula;

    
}
