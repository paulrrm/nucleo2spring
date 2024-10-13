package com.uisrael.acme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.acme.model.Paquete;
import com.uisrael.acme.service.IPaqueteService;

@Controller
public class PaqueteController {
@Autowired
	
	IPaqueteService service;
	
	@GetMapping("/ListadoPaquete")
	public String ListarEventos(Model model) {
		List<Paquete> listar = service.listar();
		model.addAttribute("listadoPaquete",listar);
		return "Paquete/ListarPaquete"; 
	}
	
	@GetMapping("/NuevoPaquete") 
	public String RegistrarPaquete(Model model) {
		model.addAttribute("nuevoPaquete", new Paquete());
		return "Paquete/RegistrarPaquete";
	}
	
	
	@PostMapping("/nuevoPaqueteR")
	public String Guardar(@ModelAttribute("nuevoPaquete") Paquete nuevo) {
		
		service.insertarPaquete(nuevo);
		return "redirect:/NuevoPaquete"; 
	}
	
	@GetMapping("/editarPaquete/{idPaquete}")
	public String editar(@PathVariable(value = "idPaquete") int idPaquete, Model model) {
		Paquete edit = service.listarPaquete(idPaquete);
		model.addAttribute("nuevoPaquete",edit);
		return "Paquete/RegistrarPaquete";
	}
	
	
}
