package com.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app1.springboot_aplicacion.models.dto.ParametroDTO;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/parametros")  // Ruta Principal para Todos lo metodos de esta Clase 
public class RequestParamControllers {

    @GetMapping("/detalle") // Ruta del Metodo
    public ParametroDTO detalle(@RequestParam (required = false, defaultValue = "Hola a Todos") //Si no se recibe parametros
                                    String informacion){    // Si Recibimos el parametro desde la URI
        ParametroDTO parametro1 = new ParametroDTO();  // Instanciamos para acceder el metodo SET
        parametro1.setInformacion(informacion); //Mediante el metodo Set enviamos información 
        return parametro1; 
    }
}
