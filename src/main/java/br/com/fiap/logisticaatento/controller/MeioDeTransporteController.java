package br.com.fiap.logisticaatento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meio-de-transporte")
public class MeioDeTransporteController {

    @GetMapping("/form")
    public String form() {
        return "meio-de-transporte-form.html";
    }


}
