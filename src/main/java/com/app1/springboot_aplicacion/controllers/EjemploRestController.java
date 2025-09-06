package com.app1.springboot_aplicacion.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app1.springboot_aplicacion.models.Empleados;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    public Map<String, Object>  detalles_info2(){  //Map: Es una estructura de datos que almacena pares clave-valor. String: El tipo de las claves (siempre serán textos) Object: El tipo de los valores (pueden ser cualquier tipo de objeto). detalles_info2: Nombre del método
        Empleados empleado1 = new Empleados("Rodrygo", "Carita", "Mecapaca Nro.2154", 
                                            "Gerente", 29, 71242948, 001);
        Map<String, Object> respuesta = new HashMap<>();  //crea una instancia de una mapa. En este caso HashMap
        respuesta.put("Empleado", empleado1); //put: Agrega o actualiza un par clave-valor en el mapa
        return respuesta;  // Spring convierte esto a JSON automáticamente 
    }

}
