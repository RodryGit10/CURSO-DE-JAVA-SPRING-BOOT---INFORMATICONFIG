package com.app1.springboot_aplicacion.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object>  detalles_info2(){  //Map: Es una estructura de datos que almacena pares clave-valor. String: El tipo de las claves (siempre serán textos) Object: El tipo de los valores (pueden ser cualquier tipo de objeto). detalles_info2: Nombre del método
        Map<String, Object> respuesta = new HashMap<>();  //crea una instancia de una mapa. En este caso HashMap
        respuesta.put("Titulo", "Servidor en Linea 👍😊"); //put: Agrega o actualiza un par clave-valor en el mapa
        respuesta.put("Servidor", "RodrigoSpring 🙌");
        respuesta.put("Ip", "192.168.1.1 👌");
        return respuesta;  // Spring convierte esto a JSON automáticamente
    }


}
