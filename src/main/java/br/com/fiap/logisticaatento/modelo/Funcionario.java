package br.com.fiap.logisticaatento.modelo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import br.com.fiap.logisticaatento.dados.Nome;
import br.com.fiap.logisticaatento.dados.Endereco;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Embedded
    private Nome nome;

    @Embedded
    private Endereco endereco;
    private LocalTime horaDeTrabalho;

    public Funcionario(Nome nome, Endereco endereco, LocalTime horaDeTrabalho) {
        this.nome = nome;
        this.endereco = endereco;
        this.horaDeTrabalho = horaDeTrabalho;
    }

    Funcionario() {}

    public String nomeCompleto(){
        return nome.getNomeCompleto();
    }

    public String enderecoSimplificado() {
        return endereco.enderecoFormatado();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalTime getHoraDeTrabalho() {
        return horaDeTrabalho;
    }

    public void setHoraDeTrabalho(LocalTime horaDeTrabalho) {
        this.horaDeTrabalho = horaDeTrabalho;
    }
}
