package br.com.fiap.logisticaatento.controller;

import br.com.fiap.logisticaatento.dto.FuncionarioForm;
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

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/form")
    public String form() {
        return "funcionarios-form";
    }

    @GetMapping
    public String lista(Model model) {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();

        model.addAttribute("funcionarios", funcionarios);

        return "funcionarios-lista";
    }

    @PostMapping
    public String salva(FuncionarioForm funcionarioForm) {
        Funcionario funcionario = funcionarioForm.build();

        funcionarioRepository.save(funcionario);

        return "redirect:funcionarios";
    }
}