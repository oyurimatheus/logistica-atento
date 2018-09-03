package br.com.fiap.logisticaatento.modelo;

import br.com.fiap.logisticaatento.modelo.Nome;
import br.com.fiap.logisticaatento.modelo.Endereco;


import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Candidato {

    @Id
    @GeneratedValue
    private long id;

    @Embedded
    private Nome nome;

    @Embedded
    private Endereco endereco;

    private boolean situacao;

    public Candidato(long id, Nome nome, Endereco endereco, boolean situacao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.situacao = situacao;
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

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
