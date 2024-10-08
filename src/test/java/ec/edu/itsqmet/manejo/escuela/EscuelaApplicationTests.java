package ec.edu.itsqmet.manejo.escuela;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.manejo.escuela.model.Profesor;
import ec.edu.itsqmet.manejo.escuela.service.IProfesorService;

@SpringBootTest
class EscuelaApplicationTests {

	@Autowired
	private IProfesorService profesorService;

	@Test
	void contextLoads() {

		Profesor profesor = new Profesor();
		profesor.setNombreProfesor("Danny");
		profesor.setApellidoProfesor("Bermeo");
		profesor.setEmailProfesor("test@test.com");
		profesor.setDireccionProfesor("test@test.com");
		profesor.setCedulaProfesor("12123132");
		profesorService.insertProfesor(profesor);

		Profesor profesor2 = new Profesor();
		profesor2.setIdProfesor(0);
		profesor2.setNombreProfesor("Juan");
		profesor2.setNombreProfesor("Danny");
		profesor2.setApellidoProfesor("Bermeo");
		profesor2.setEmailProfesor("test@test.com");
		profesor2.setDireccionProfesor("test@test.com");
		profesor2.setCedulaProfesor("12123132");
		profesorService.insertProfesor(profesor2);

		profesorService.deleteProfesor(0);


		
	}

}
