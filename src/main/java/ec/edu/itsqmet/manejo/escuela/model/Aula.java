package ec.edu.itsqmet.manejo.escuela.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Aula implements Serializable { //
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAula;
    private String nombreAula;
    private int capacidadAula;
    
    @OneToMany(mappedBy = "fkAulaCurso")
    private List<Curso> fkcursos;
}
