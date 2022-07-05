package com.roshka.bootcamp.roshkagram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller/*configura esta clase como un componente de spring del tipo controlador*/
public class IndexController {

    /*metodos de accion que manejan una peticion http del usuario*/
    @GetMapping(value = "/")
    public String index(){

        return "index";
    }
}
