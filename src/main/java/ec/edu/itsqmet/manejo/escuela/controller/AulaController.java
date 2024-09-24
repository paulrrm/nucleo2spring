package ec.edu.itsqmet.manejo.escuela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AulaController {

    @GetMapping("aula")
    public String paginaAula() {
        return "/Aula/listarAula";
    }
    

}
