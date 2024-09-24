package ec.edu.itsqmet.manejo.escuela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

    @GetMapping("/inicio")
    public String paginaInicial() {
        return "index";
    }
    
}
