package com.app1.springboot_aplicacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app1.springboot_aplicacion.models.Empleados;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {  // instaciamos "Model", poniendo como nombre "model"
        //Instanciamos el modelo para acceder a sus atributos
        Empleados empleado1 = new Empleados("Rodrygo", "Carita", null,
                                            "Gerente", 29, 71242948, 001);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

}
