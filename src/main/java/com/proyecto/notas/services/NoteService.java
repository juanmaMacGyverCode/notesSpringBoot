package com.proyecto.notas.services;

import com.proyecto.notas.model.Nota;

public interface NoteService {

    Iterable<Nota> listAllNotes();
}
