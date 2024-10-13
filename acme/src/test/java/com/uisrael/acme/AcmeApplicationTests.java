package com.uisrael.acme;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.acme.model.Cliente;
import com.uisrael.acme.model.Evento;
import com.uisrael.acme.model.Paquete;
import com.uisrael.acme.model.Producto;
import com.uisrael.acme.service.IClienteService;
import com.uisrael.acme.service.IEventoService;
import com.uisrael.acme.service.IPaqueteService;
import com.uisrael.acme.service.IProductoService;

@SpringBootTest
class AcmeApplicationTests {
	@Autowired
	IClienteService c;
	@Autowired
	IEventoService e;
	@Autowired
	IPaqueteService pa;
	@Autowired
	IProductoService pr;
	@Test
	void contextLoads() {
		
		Cliente nuevoc = new Cliente();
		nuevoc.setNombreCliente("Dayana Chavez");
		nuevoc.setTelefono("0992610711");
		nuevoc.setCorreoCliente("daya@gmailcom");
		nuevoc.setEstadoCliente(true);
		//c.insertarCliente(nuevoc);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombreCliente("Carlos Torres");
		cliente1.setTelefono("0987654321");
		cliente1.setCorreoCliente("carlos@gmail.com");
		cliente1.setEstadoCliente(true);
		//c.insertarCliente(cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombreCliente("María Rodríguez");
		cliente2.setTelefono("0965432109");
		cliente2.setCorreoCliente("maria@hotmail.com");
		cliente2.setEstadoCliente(true);
		//c.insertarCliente(cliente2);

		Cliente cliente3 = new Cliente();
		cliente3.setNombreCliente("Pedro Gómez");
		cliente3.setTelefono("0977123456");
		cliente3.setCorreoCliente("pedro@yahoo.com");
		cliente3.setEstadoCliente(true);
		//c.insertarCliente(cliente3);


		
		List<Cliente> listac = c.listar();
		for (Cliente cliente : listac) {
			System.out.println(cliente.getNombreCliente());
			System.out.println(cliente.getTelefono());
			System.out.println(cliente.getCorreoCliente());
		}
		
		Evento nuevoe= new Evento();
		nuevoe.setEstado("Pendiente");
		nuevoe.setFechaEvento(new Date());
		//e.insertarEvento(nuevoe);
		
		Evento evento1 = new Evento();
		evento1.setEstado("Pendiente");
		evento1.setFechaEvento(new Date(122,2,20));
		//e.insertarEvento(evento1);

		Evento evento2 = new Evento();
		evento2.setEstado("En proceso");
		evento2.setFechaEvento(new Date(122,2,20));
		//e.insertarEvento(evento2);

		Evento evento3 = new Evento();
		evento3.setEstado("Finalizado");
		evento3.setFechaEvento(new Date(122,2,20));
		//e.insertarEvento(evento3);

		Evento evento4 = new Evento();
		evento4.setEstado("Pendiente");
		evento4.setFechaEvento(new Date(122,2,20));
		//e.insertarEvento(evento4);
		
		List<Evento> listae = e.listar();
		for (Evento evento : listae) {
			System.out.println(evento.getEstado());
			System.out.println(evento.getFechaEvento());
		}
		
		Paquete nuevopa= new Paquete();
		nuevopa.setDetalle("Boda noventera");
		nuevopa.setPrecio(12019);
		//pa.insertarPaquete(nuevopa);
		
		Paquete paquete1 = new Paquete();
		paquete1.setDetalle("Fiesta de Cumpleaños");
		paquete1.setPrecio(1500);
		//pa.insertarPaquete(paquete1);

		Paquete paquete2 = new Paquete();
		paquete2.setDetalle("Bautizo Elegante");
		paquete2.setPrecio(2000);
		//pa.insertarPaquete(paquete2);

		Paquete paquete3 = new Paquete();
		paquete3.setDetalle("Aniversario Romántico");
		paquete3.setPrecio(1800);
		//pa.insertarPaquete(paquete3);

		Paquete paquete4 = new Paquete();
		paquete4.setDetalle("Graduación Especial");
		paquete4.setPrecio(2500);
		//pa.insertarPaquete(paquete4);
		
		List<Paquete> listapa = pa.listar();
		for (Paquete paquete : listapa) {
			System.out.println(paquete.getDetalle());
			System.out.println(paquete.getPrecio());
		}
		
		Producto nuevopr= new Producto();
		nuevopr.setNombreProducto("Flores");
		nuevopr.setDescripcion("Arreglos para mesas");
		pr.insertarProducto(nuevopr);
		
		Producto producto1 = new Producto();
		producto1.setNombreProducto("Torta de Cumpleaños");
		producto1.setDescripcion("Deliciosa torta decorada para celebraciones");
		pr.insertarProducto(producto1);

		Producto producto2 = new Producto();
		producto2.setNombreProducto("Centros de Mesa");
		producto2.setDescripcion("Decoraciones florales para mesas");
		pr.insertarProducto(producto2);

		Producto producto3 = new Producto();
		producto3.setNombreProducto("Invitaciones Personalizadas");
		producto3.setDescripcion("Tarjetas de invitación únicas y personalizadas");
		pr.insertarProducto(producto3);

		Producto producto4 = new Producto();
		producto4.setNombreProducto("DJ y Sistema de Sonido");
		producto4.setDescripcion("Servicio de DJ con sistema de sonido profesional");
		pr.insertarProducto(producto4);

		Producto producto5 = new Producto();
		producto5.setNombreProducto("Servicio de Fotografía");
		producto5.setDescripcion("Cobertura fotográfica profesional para eventos");
		pr.insertarProducto(producto5);
		
		List<Producto> listapr = pr.listar();
		for (Producto producto : listapr) {
			System.out.println(producto.getNombreProducto());
			System.out.println(producto.getDescripcion());
		}
		
	}

}
