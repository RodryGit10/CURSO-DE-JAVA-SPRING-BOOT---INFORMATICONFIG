package com.app1.springboot_aplicacion.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app1.springboot_aplicacion.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) { // instaciamos "Model", poniendo como nombre "model"
        // Instanciamos el modelo para acceder a sus atributos
        Empleados empleado1 = new Empleados("Rodrygo", "Carita", null,
                "Gerente", 29, 71242948, 001);
        model.addAttribute("Empleado1", empleado1);  // Todo la data que esta en empleado1 se la pasa a Empleado1
        return "detalles_info";
    }

    @ModelAttribute("Empleados2") // Toda la lista se almacencará con ModelAttribute pudiendo acceder a ella atraves de Empleados2
    public List<Empleados> ListaEmpleados() {  //Metodo ListaEmpleados, tipo de datos tabla -> Empleados
        return Arrays.asList(
                new Empleados("María", "Perez", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
                new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
                new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
                new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
                new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05));
    }

}
