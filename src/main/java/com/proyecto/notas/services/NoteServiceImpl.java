package com.proyecto.notas.services;

import com.proyecto.notas.model.Nota;
import com.proyecto.notas.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Iterable<Nota> listAllNotes() {
        return this.noteRepository.findAll();
    }
}
