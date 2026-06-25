package com.ejercicio.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejercicio.mvc.model.Fruta;

import java.util.List;

@Controller
public class FrutaController {

    @GetMapping("/")
    public String inicio(Model model) {

        /**
         * Se envian datos a la Vista
         */
        model.addAttribute("titulo", "Lista de Frutas");
        model.addAttribute("mensaje", "Bienvenido al sistema MVC con Spring Boot");

        List<Fruta> frutas = List.of(
            new Fruta("Manzana", "Rojo"),
            new Fruta("Banano",  "Amarillo"),
            new Fruta("Uva",     "Morado"),
            new Fruta("Kiwi",    "Verde")
        );

        model.addAttribute("frutas", frutas);

        return "index"; // index.java
    }
}
