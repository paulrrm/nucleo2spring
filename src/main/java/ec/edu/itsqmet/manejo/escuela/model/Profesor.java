package ec.edu.itsqmet.manejo.escuela.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Profesor  implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    @Column(length = 10)
    private String cedulaProfesor; 
    @Column(length = 50)
    private String apellidoProfesor;
    @Column(length = 50)
    private String nombreProfesor;
    @Column(length = 100)
    private String direccionProfesor;
    @Column(length = 250)
    private String emailProfesor;

    @OneToMany(mappedBy = "fkprofesorc")
    private List<Curso> fkcursosp = new ArrayList<>(); //   Relación con Curso

}
