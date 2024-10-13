package com.uisrael.acme.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.acme.model.Evento;
import com.uisrael.acme.service.IEventoService;

@Controller
public class EventoController {

	@Autowired
	
	IEventoService eventoService;
	
	@GetMapping("/ListadoEventos")
	public String ListarEventos(Model model) {
		List<Evento> listarEvento = eventoService.listarActivos();
		model.addAttribute("listadoEvento",listarEvento);
		return "Evento/ListarEvento"; 
	}
	
	@GetMapping("/NuevoEvento") 
	public String RegistrarEvento(Model model) {
		model.addAttribute("nuevoEvento", new Evento());
		return "Evento/RegistarEvento"; 
	}
	
	
	@PostMapping("/nuevoEventoR")
	public String GuardarEvento(@ModelAttribute("nuevoEvento") Evento nuevoEvento) {
		
		nuevoEvento.setFechaEvento(new Date());
		eventoService.insertarEvento(nuevoEvento);
		return "redirect:/NuevoEvento"; 
	}
	
	@GetMapping("/editarEvento/{idEvento}")
	public String editar(@PathVariable(value = "idEvento") int idEvento, Model model) {
		Evento eventoEdit = eventoService.listar(idEvento);
		model.addAttribute("nuevoEvento",eventoEdit);
		return "Evento/RegistarEvento";
	}
	
	@GetMapping("/eliminarEvento/{idEvento}")
	public String eliminar(@PathVariable(value = "idEvento") int idEvento) {
		eventoService.eliminar(idEvento);
		return "redirect:/ListadoEventos";
	}
}
