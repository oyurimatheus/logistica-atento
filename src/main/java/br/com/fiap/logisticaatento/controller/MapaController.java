package br.com.fiap.logisticaatento.controller;

import br.com.fiap.logisticaatento.repository.FretadoRepository;
import br.com.fiap.logisticaatento.repository.FuncionarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mapa")
public class MapaController {


    private final FuncionarioRepository funcionariosRepository;
    private final FretadoRepository fretadoRepository;

    public MapaController(FuncionarioRepository funcionariosRepository, FretadoRepository fretadoRepository) {
        this.funcionariosRepository = funcionariosRepository;
        this.fretadoRepository = fretadoRepository;
    }

    @GetMapping
    public String mapa(Model model) {

        model.addAttribute("funcionarios", funcionariosRepository.findAll());
        model.addAttribute("fretados", fretadoRepository.findAll());

        return "mapa.html";
    }
}
