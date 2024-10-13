package com.uisrael.acme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.acme.model.Producto;
import com.uisrael.acme.service.IProductoService;

@Controller
public class ProductoController {
@Autowired
	
	IProductoService service;
	
	@GetMapping("/ListadoProducto")
	public String ListarEventos(Model model) {
		List<Producto> listar = service.listar();
		model.addAttribute("listadoProducto",listar);
		return "Producto/ListarProducto"; 
	}
	
	@GetMapping("/NuevoProducto") 
	public String RegistrarProducto(Model model) {
		model.addAttribute("nuevoProducto", new Producto());
		return "Producto/RegistrarProducto";
	}
	
	
	@PostMapping("/nuevoProductoR")
	public String Guardar(@ModelAttribute("nuevoProducto") Producto nuevo) {
		
		service.insertarProducto(nuevo);
		return "redirect:/NuevoProducto"; 
	}
	@GetMapping("/editarProducto/{idProucto}")
	public String editar(@PathVariable(value = "idProucto") int idProucto, Model model) {
		Producto edit = service.listarProducto(idProucto);
		model.addAttribute("nuevoProducto",edit);
		return "Producto/RegistrarProducto";
	}
}
