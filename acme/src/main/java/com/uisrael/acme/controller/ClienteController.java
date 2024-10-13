package com.uisrael.acme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.acme.model.Cliente;
import com.uisrael.acme.service.IClienteService;

@Controller
public class ClienteController {

@Autowired
	
	IClienteService service;
	
	@GetMapping("/ListadoClientes")
	public String ListarEventos(Model model) {
		List<Cliente> listar = service.listarClientesActivos();
		model.addAttribute("listadoCliente",listar);
		return "Cliente/ListarCliente"; 
	}
	
	@GetMapping("/NuevoCliente") 
	public String RegistrarCliente(Model model) {
		model.addAttribute("nuevoCliente", new Cliente());
		return "Cliente/RegistrarCliente";
	}
	
	
	@PostMapping("/nuevoClienteR")
	public String Guardar(@ModelAttribute("nuevoCliente") Cliente nuevo) {
		nuevo.setEstadoCliente(true);
		service.insertarCliente(nuevo);
		return "redirect:/NuevoCliente"; 
	}
	@GetMapping("/editarCliente/{idCliente}")
	public String editarCliente(@PathVariable(value = "idCliente") int idCliente, Model model) {
		Cliente clienteEdit = service.listarCliente(idCliente);
		model.addAttribute("nuevoCliente",clienteEdit);
		return "Cliente/RegistrarCliente";
	}
	
	@GetMapping("/eliminarCliente/{idCliente}")
	public String eliminarCliente(@PathVariable(value = "idCliente") int idCliente) {
		service.eliminarCliente(idCliente);
		return "redirect:/ListadoClientes";
	}
}
