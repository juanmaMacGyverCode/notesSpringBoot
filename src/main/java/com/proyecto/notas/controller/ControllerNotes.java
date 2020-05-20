package com.proyecto.notas.controller;

import com.proyecto.notas.components.ComponentsNotes;
import com.proyecto.notas.configuration.FilesHTML;
import com.proyecto.notas.model.Nota;
import com.proyecto.notas.services.NoteService;
import com.proyecto.notas.services.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ControllerNotes {

    //private ComponentsNotes _componentsNotes;
    @Autowired
    private NoteService service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/showNotes")
    public ModelAndView showNotes() {
        ModelAndView modelAndView = new ModelAndView(FilesHTML.SHOW);
        /*List<Nota> postFiltrado = this.service.listAllNotes().stream().filter( (p) -> {
            return p.getId() == id;
        }).collect(Collectors.toList());*/
        //List<Nota> postFiltrado = (List<Nota>) this.service.listAllNotes();
        //System.out.println(this.service.listAllNotes().forEach( nota -> { return nota.getIdNota() == id; }));
        modelAndView.addObject("notes", this.service.listAllNotes());
        return modelAndView;
        /*ModelAndView view = new ModelAndView();
        view.addObject("notes", this.service.listAllNotes());
        view.setViewName("listAllNotes");
        return view;*/
    }


}
