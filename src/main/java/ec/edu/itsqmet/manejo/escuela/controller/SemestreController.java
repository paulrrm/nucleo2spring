package ec.edu.itsqmet.manejo.escuela.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ec.edu.itsqmet.manejo.escuela.model.Semestre;
import ec.edu.itsqmet.manejo.escuela.service.ISemestreService;

@Controller
public class SemestreController {

    @Autowired
    ISemestreService service;

    @GetMapping("semestre")
    public String semestre(Model model) {
        List<Semestre> list = service.read();
        model.addAttribute("listaSemestres", list);
        return "/Semestre/listarSemestre";
    }

    	@GetMapping("/NuevoSemestre") 
	public String RegistrarSemestre(Model model) {
		model.addAttribute("nuevoSemestre", new Semestre());
		return "Cliente/RegistrarCliente";
	}
	

	@GetMapping("/eliminarSemestre/{idSemestre}")
	public String eliminarSemestres(@PathVariable(value = "idSemestre") int idSemestre) {
		service.delete(idSemestre);
		return "redirect:/ListadoClientes";
	}
}
