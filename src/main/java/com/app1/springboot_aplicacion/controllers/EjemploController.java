package com.app1.springboot_aplicacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en Linea 👍😊");
        model.addAttribute("Servidor", "RodrigoSpring 🙌");
        model.addAttribute("Ip", "192.168.1.1 👌");
        return "detalles_info";
    }

}
