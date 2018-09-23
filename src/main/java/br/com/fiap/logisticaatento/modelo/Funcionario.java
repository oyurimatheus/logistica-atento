package br.com.fiap.logisticaatento.modelo;

import java.time.LocalTime;
import br.com.fiap.logisticaatento.dados.Nome;
import br.com.fiap.logisticaatento.dados.Endereco;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Nome nome;

    @Embedded
    private Endereco endereco;
    private LocalTime horaDeTrabalho;

    public Funcionario(long id, Nome nome, Endereco endereco, LocalTime horaDeTrabalho) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.horaDeTrabalho = horaDeTrabalho;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
