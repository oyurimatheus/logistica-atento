package br.com.fiap.logisticaatento.dados;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String cep;

    private String nomeDaRua;

    private int numero;
    private String complemento;

    public Endereco(String cep, String nomeDaRua, int numero, String complemento) {
        this.cep = cep;
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
