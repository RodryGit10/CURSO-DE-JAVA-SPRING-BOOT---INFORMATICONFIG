package com.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app1.springboot_aplicacion.models.dto.ParametroDTO;

@RestController
@RequestMapping("/api/variable")
public class PathVariableControllers {

    @GetMapping("/pagina1/{mensaje}") //Desde la URI se debe mandar el mensaje, y lo recibira como variable
    public ParametroDTO pag1(@PathVariable String mensaje){ //la variable se debe recibir si o si
        ParametroDTO parametro1 = new ParametroDTO();// Instanciacion
        parametro1.setInformacion(mensaje);  // Acceder al metodo SET para enviar el mensaje
        return parametro1; // Retronamos el mensaje para visualizar en el navegador como json
    }
}
