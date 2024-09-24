package ec.edu.itsqmet.manejo.escuela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.edu.itsqmet.manejo.escuela.model.Curso;
import ec.edu.itsqmet.manejo.escuela.repository.ICursoRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class CursoContoller {
    @Autowired 
    ICursoRepository cursoRepository;

    @GetMapping("curso")
    public String curso() {
        return "/Curso/listarCurso";
    }

    @PostMapping("path")
    public Curso postMethodName(@RequestBody Curso entity) {

        return cursoRepository.save(entity);
    }
    @DeleteMapping("path")
    public void deleteMethodName(@RequestParam Integer id) {
        cursoRepository.deleteById(id);
    }   
    
    

}
