package com.wlbreda.teste.controllers;

import com.wlbreda.teste.models.Param2INT;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    public String compareParam(Param2INT param) {
        String ret = "";
        if (param.getPrimeiro() > param.getSegundo()) {
            ret = param.getPrimeiro() + " maior que " + param.getSegundo();
        } else if (param.getPrimeiro() < param.getSegundo()) {
            ret = param.getPrimeiro() + " menor que " + param.getSegundo();
        } else {
            ret = param.getPrimeiro() + " igual a " + param.getSegundo();
        }
        return ret;
    }

    public String getParam(String str) {
        return "pega então (" + str + ")";
    }

}
