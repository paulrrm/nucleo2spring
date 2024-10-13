package com.uisrael.acmemoda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.uisrael.acmemoda.modelo.Cliente;
import com.uisrael.acmemoda.servicio.IClienteServicio;

@Controller
public class ClienteControlador {
	
	@Autowired
	public IClienteServicio servicioCliente;

	@GetMapping("/listarcliente") //URL de llamada de mapeo URL
	public String listarCliente(Model model) {
		List<Cliente>listaCliente= servicioCliente.listarCliente(); //recuperando la información del cliente
		model.addAttribute("listaCli", listaCliente);
		return "/cliente/listacliente"; // ruta física de la página
	}
	
	@GetMapping("/nuevocliente")
	public String Cliente() {
		return "/cliente/cliente"; // ruta física de la página
	}

}
