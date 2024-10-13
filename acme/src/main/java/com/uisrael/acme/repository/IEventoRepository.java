package com.uisrael.acme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.acme.model.Evento;

import jakarta.transaction.Transactional;

public interface IEventoRepository extends JpaRepository<Evento, Integer>{

	public Evento findById(int idEvento);
	@Transactional
    @Modifying
    @Query("UPDATE Evento c SET c.estado = 'Finalizado' WHERE c.idEvento = ?1")
	public void suspenderEvento(int idEvento);
	
	@Transactional
	@Query("Select ctg from Evento ctg where ctg.estado in ('Pendiente','En proceso') ")
	public List<Evento> listadoActivas();
}
