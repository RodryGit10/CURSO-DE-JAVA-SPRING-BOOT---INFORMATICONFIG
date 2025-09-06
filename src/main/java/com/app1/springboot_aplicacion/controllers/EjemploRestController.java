package com.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app1.springboot_aplicacion.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController  //Indica que es API
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    public ClaseDTO detalles_info(){  //Metodo -> detalles_info de clase ClaseDTO
        ClaseDTO usuario1 = new ClaseDTO(); //Instanciacion
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Rodry.sim");
        return usuario1;
    }

}
