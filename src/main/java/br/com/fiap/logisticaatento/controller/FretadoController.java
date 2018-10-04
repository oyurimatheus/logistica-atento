package br.com.fiap.logisticaatento.controller;

import br.com.fiap.logisticaatento.modelo.Fretado;
import br.com.fiap.logisticaatento.modelo.MeioDeTransporte;
import br.com.fiap.logisticaatento.repository.FretadoRepository;
import br.com.fiap.logisticaatento.repository.MeioDeTransporteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fretados")
public class FretadoController {

    private FretadoRepository fretadoRepository;

    public FretadoController(FretadoRepository fretadoRepository) {
        this.fretadoRepository = fretadoRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("fretados", fretadoRepository.findAll());

        return "fretados-lista.html";
    }

    @GetMapping("/form")
    public String form() {
        return "fretados-form.html";
    }

    @PostMapping
    public String salva(Fretado fretado) {

        fretadoRepository.save(fretado);

        return "redirect:fretados";
    }


}
