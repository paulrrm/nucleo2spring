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
import com.uisrael.acme.model.DetallePedido;
import com.uisrael.acme.model.Evento;
import com.uisrael.acme.model.Paquete;
import com.uisrael.acme.model.Producto;
import com.uisrael.acme.service.IClienteService;
import com.uisrael.acme.service.IDetallePedidoService;
import com.uisrael.acme.service.IEventoService;
import com.uisrael.acme.service.IPaqueteService;
import com.uisrael.acme.service.IProductoService;

@Controller
public class DetallePedidoController {

@Autowired
	IDetallePedidoService service;
@Autowired
	IClienteService serviceCliente;
@Autowired
	IEventoService serviceEvento;
@Autowired
	IProductoService serviceProducto;
@Autowired
	IPaqueteService servicePaquete;
	
	@GetMapping("/ListadoDetallePedido")
	public String ListarEventos(Model model) {
		List<DetallePedido> listar = service.listar();
		model.addAttribute("listadoDetallePedido",listar);
		return "DetallePedido/ListarDetalle"; 
	}
	
	@GetMapping("/NuevoDetallePedido") 
	public String Registrar(Model model) {
		List<Cliente> listarCliente = serviceCliente.listarClientesActivos();
		List<Evento> listarEvento = serviceEvento.listar();
		List<Producto> listarProducto = serviceProducto.listar();
		List<Paquete> listarPaquete = servicePaquete.listar();
		model.addAttribute("listadoCliente",listarCliente);
		model.addAttribute("listadoEvento",listarEvento);
		model.addAttribute("listadoProducto",listarProducto);
		model.addAttribute("listadoPaquete",listarPaquete);
		model.addAttribute("nuevoDetallePedido", new DetallePedido());
		return "DetallePedido/RegistrarDetalle";
	}
	
	
	@PostMapping("/nuevoDetallePedidoR")
	public String Guardar(@ModelAttribute("nuevoDetallePedido") DetallePedido nuevo) {
		service.insertar(nuevo);
		return "redirect:/ListadoDetallePedido"; 
	}
	
	@GetMapping("/eliminarDetalle/{idDetallePedido}")
	public String eliminar(@PathVariable(value = "idDetallePedido") int idDetallePedido) {
		service.eliminar(idDetallePedido);
		return "redirect:/ListadoDetallePedido";
	}
}
