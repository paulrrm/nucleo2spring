package ec.edu.itsqmet.manejo.escuela.service;



import ec.edu.itsqmet.manejo.escuela.model.Profesor;


public interface IProfesorService {


    public void insertProfesor(Profesor profesor);
    public void updateProfesor(Profesor profesor); 
    public void deleteProfesor(Integer id); 

}
