package br.com.fiap.logisticaatento.controller;

import br.com.fiap.logisticaatento.modelo.MeioDeTransporte;
import br.com.fiap.logisticaatento.repository.MeioDeTransporteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meio-de-transporte")
public class MeioDeTransporteController {

    private MeioDeTransporteRepository meioDeTransporteRepository;

    public MeioDeTransporteController(MeioDeTransporteRepository meioDeTransporteRepository) {
        this.meioDeTransporteRepository = meioDeTransporteRepository;
    }

    @GetMapping("/form")
    public String form() {
        return "meio-de-transporte-form.html";
    }

    @PostMapping
    public String salva(MeioDeTransporte meioDeTransporte) {

        meioDeTransporteRepository.save(meioDeTransporte);

        return "redirect:meio-de-transporte";
    }


}
