package com.eventoapp.repository;

import com.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String> {
}

