package com.uisrael.acme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.acme.model.DetallePedido;
import com.uisrael.acme.repository.IDetallePedidoRepository;
import com.uisrael.acme.service.IDetallePedidoService;

@Service
@Component
public class DetallePedidoServiceImpl implements IDetallePedidoService {

	@Autowired
	private IDetallePedidoRepository repo;
	
	@Override
	public void insertar(DetallePedido nuevo) {
		// TODO Auto-generated method stub
		repo.save(nuevo);
	}

	@Override
	public void actualizar(DetallePedido elimina) {
		// TODO Auto-generated method stub
		repo.save(elimina);
	}

	@Override
	public List<DetallePedido> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(int elimina) {
		// TODO Auto-generated method stub
		repo.deleteById(elimina);
	}

}
