package com.proyecto.notas.controller;

import com.proyecto.notas.components.ComponentsNotes;
import com.proyecto.notas.configuration.FilesHTML;
import com.proyecto.notas.services.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerNotes {

    //private ComponentsNotes _componentsNotes;
    @Autowired
    private NoteServiceImpl noteServiceImpl;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/showNotes")
    public ModelAndView showNotes() {
        ModelAndView modelAndView = new ModelAndView(FilesHTML.SHOW);
        modelAndView.addObject("notes", this.noteServiceImpl.listAllNotes());
        return modelAndView;
    }


}
