package com.proyecto.notas.repositories;

import com.proyecto.notas.model.Nota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Nota, Integer> {
}
