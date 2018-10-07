package br.com.fiap.logisticaatento.controller;

import br.com.fiap.logisticaatento.dto.FuncionarioForm;
import br.com.fiap.logisticaatento.modelo.Fretado;
import br.com.fiap.logisticaatento.modelo.MeioDeTransporte;
import br.com.fiap.logisticaatento.repository.FretadoRepository;
import br.com.fiap.logisticaatento.repository.MeioDeTransporteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.logisticaatento.modelo.Funcionario;
import br.com.fiap.logisticaatento.repository.FuncionarioRepository;

import java.util.List;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private FuncionarioRepository funcionarioRepository;
    private MeioDeTransporteRepository meioDeTransporteRepository;
    private FretadoRepository fretadoRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository, MeioDeTransporteRepository meioDeTransporteRepository, FretadoRepository fretadoRepository) {
        this.funcionarioRepository = funcionarioRepository;
        this.meioDeTransporteRepository = meioDeTransporteRepository;
        this.fretadoRepository = fretadoRepository;
    }

    @GetMapping("/form")
    public String form(Model model) {
        List<MeioDeTransporte> meiosDeTransportes = meioDeTransporteRepository.findAll();
        List<Fretado> fretados = fretadoRepository.findAll();

        model.addAttribute("meiosDeTransporte", meiosDeTransportes);
        model.addAttribute("fretados", fretados);

        return "funcionarios-form";
    }

    @GetMapping
    public String lista(Model model) {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        System.out.println(funcionarios);
        model.addAttribute("funcionarios", funcionarios);

        return "funcionarios-lista";
    }

    @PostMapping
    public String salva(FuncionarioForm funcionarioForm) {
        Funcionario funcionario = funcionarioForm.build(meioDeTransporteRepository, fretadoRepository);

        funcionarioRepository.save(funcionario);

        return "redirect:funcionarios";
    }
}