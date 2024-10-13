package com.uisrael.acmemoda;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.acmemoda.modelo.Categoria;
import com.uisrael.acmemoda.modelo.Cliente;
import com.uisrael.acmemoda.modelo.Empleado;
import com.uisrael.acmemoda.modelo.OrdenPedido;
import com.uisrael.acmemoda.modelo.Pedido;
import com.uisrael.acmemoda.modelo.Producto;
import com.uisrael.acmemoda.modelo.Sucursal;
import com.uisrael.acmemoda.modelo.SucursalProducto;
import com.uisrael.acmemoda.servicio.ICategoriaServicio;
import com.uisrael.acmemoda.servicio.IClienteServicio;
import com.uisrael.acmemoda.servicio.IEmpleadoServicio;
import com.uisrael.acmemoda.servicio.IOrdenPedidoServicio;
import com.uisrael.acmemoda.servicio.IPedidoServicio;
import com.uisrael.acmemoda.servicio.IProductoServicio;
import com.uisrael.acmemoda.servicio.ISucursalProductoServicio;
import com.uisrael.acmemoda.servicio.ISucursalServicio;

@SpringBootTest
class AcmemodaApplicationTests {

	@Autowired
	ICategoriaServicio categoriaServicio;
	@Autowired
	IClienteServicio clienteServicio;
	@Autowired
	IEmpleadoServicio empleadoServicio;
	@Autowired
	IProductoServicio productoServicio;
	@Autowired
	ISucursalServicio sucursalServicio;
	@Autowired
	IPedidoServicio pedidoServicio;
	@Autowired
	ISucursalProductoServicio sucursalProductoServicio;
	@Autowired
	IOrdenPedidoServicio ordenPedidoServicio;

	@Test
	void contextLoads() {

		Categoria nuevoCategoria = new Categoria();
		nuevoCategoria.setNombre("Caballeros");
		nuevoCategoria.setDescripcion("ropa para hombre adulto");
		nuevoCategoria.setTipo("Casual");
		nuevoCategoria.setEstado(true);
		categoriaServicio.insertarCategoria(nuevoCategoria);
		//List<Categoria> selectCategoria = categoriaServicio.listarCategoria();
		
		Sucursal nuevoSucursal = new Sucursal();
		nuevoSucursal.setNombre("Sucursal El Recreo");
		nuevoSucursal.setDireccion("Av. Maldonado");
		nuevoSucursal.setCorreo("sucural_recreo@acmemoda.com");
		nuevoSucursal.setTelefono("022635789");
		nuevoSucursal.setProvincia("Pichincah");
		nuevoSucursal.setCiudad("Quito");
		sucursalServicio.insertarSucursal(nuevoSucursal);
		//List<Sucursal>selectSucursal=sucursalServicio.listarSucursal();
		
		SucursalProducto nuevoSucursalProducto = new SucursalProducto();
		nuevoSucursalProducto.setFechaPedido(new Date(10 - 6 - 2024));
		nuevoSucursalProducto.setFechaEntrega(new Date(12 - 6 - 2024));
		nuevoSucursalProducto.setEstado(true);
		nuevoSucursalProducto.setFkSucursal(nuevoSucursal);
		sucursalProductoServicio.insertarSucursalProducto(nuevoSucursalProducto);
		//List<SucursalProducto>selectSucursalProducto=sucursalProductoServicio.listarSucursalProducto();

		Cliente nuevoCliente = new Cliente();
		nuevoCliente.setCedula("1720775914");
		nuevoCliente.setNombre("Danny");
		nuevoCliente.setApellido("Bermeo");
		nuevoCliente.setEdad(new Date(04 - 13 - 1991));
		nuevoCliente.setTelefono("0988734345");
		nuevoCliente.setCorreo("danny_bsc@live.com");
		nuevoCliente.setDireccion("Lucha de los Pobres");
		clienteServicio.insertarCliente(nuevoCliente);
		
		List<Cliente>listaCliente=clienteServicio.listarCliente();
		for (Cliente cliente : listaCliente) {
			System.out.printf(cliente.getIdCliente()+""+ cliente.getApellido());
		}
		
		System.out.printf("BUSCAR POR ID: ");
		nuevoCliente= clienteServicio.buscarClienteId(1);
		System.out.printf(nuevoCliente.getIdCliente()+""+ nuevoCliente.getIdCliente()+""+ nuevoCliente.getApellido());
				
		/*System.out.printf("BUSCAR POR NOMBRE: ");
		List<Cliente>listaCliente1=clienteServicio.buscarNombre("Danny");
		for (Cliente cliente : listaCliente1) {
			System.out.printf(cliente.getIdCliente()+""+ cliente.getApellido());
		}*/

		Empleado nuevoEmpleado = new Empleado();
		nuevoEmpleado.setCedula("0910171264");
		nuevoEmpleado.setNombre("Bladimir");
		nuevoEmpleado.setApellido("Ochoa");
		nuevoEmpleado.setEdad(new Date(01 - 8 - 1988));
		nuevoEmpleado.setTelefono("022673201");
		nuevoEmpleado.setCorreo("bochoa@acmemoda.com");
		nuevoEmpleado.setPuesto("El Tejar");
		empleadoServicio.insertarEmpleado(nuevoEmpleado);
		//List<Empleado>selectEmpleado=empleadoServicio.listarEmpleado();
		
		Pedido nuevoPedido = new Pedido();
		nuevoPedido.setOrden("Ped123");
		nuevoPedido.setFechaOrden(new Date(01 - 1 - 2014));
		nuevoPedido.setEstado(true);
		pedidoServicio.insertarPedido(nuevoPedido);
		//List<Pedido>selectPedido=pedidoServicio.listarPedido();
		
		OrdenPedido nuevoOrdenPedido = new OrdenPedido();
		nuevoOrdenPedido.setFechaPedido(new Date(30 - 6 - 2024));
		nuevoOrdenPedido.setEstado(true);
		nuevoOrdenPedido.setFkCliente(nuevoOrdenPedido);
		nuevoOrdenPedido.setFkEmpleado(nuevoEmpleado);
		nuevoOrdenPedido.setFkPedido(nuevoOrdenPedido);
		ordenPedidoServicio.insertarOrdenPedido(nuevoOrdenPedido);
		//List<OrdenPedido>selectOrdenPedido=ordenPedidoServicio.listarOrdenPedido();
		
		Producto nuevoProducto = new Producto();
		nuevoProducto.setNombre("Pantalon Jeans");
		nuevoProducto.setTalla("XL");
		nuevoProducto.setColor("Azul");
		nuevoProducto.setPrecio(29.99);
		nuevoProducto.setStock(120);
		nuevoProducto.setEstado(true);
		nuevoProducto.setFkProductoCategoria(nuevoCategoria);
		nuevoProducto.setFkProductoSucursal(nuevoSucursalProducto);
		nuevoProducto.setFkProductoOrdenPedido(nuevoOrdenPedido);
		productoServicio.insertarProducto(nuevoProducto);
		//List<Producto>selectProducto=productoServicio.listarProducto();
		
	}

}
