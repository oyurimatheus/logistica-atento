package br.com.fiap.logisticaatento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.logisticaatento.modelo.Funcionario;
import br.com.fiap.logisticaatento.repository.FuncionarioRepository;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/form")
    public String form() {
        return "funcionario-form";
    }

    public String salva(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return "funcionario-lista";
    }
}