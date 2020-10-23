package com.eventoapp.controllers;

import com.eventoapp.models.Evento;
import com.eventoapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository er;

    @GetMapping("/cadastrarEvento")
    public String form() {

        return "evento/formEvento";
    }

    @PostMapping("/cadastrarEvento")
    public String form(Evento evento) {
        er.save(evento);
        return "redirect:/cadastrarEvento";
    }

    @GetMapping("/listaEventos")
    public ModelAndView listaEventos() {
        ModelAndView mv = new ModelAndView("listaEventos");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }
}
