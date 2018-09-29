package br.com.fiap.logisticaatento.dados;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String cep;

    private String rua;

    private String numero;
    private String complemento;

    public Endereco(String cep, String nomeDaRua, String numero, String complemento) {
        this.cep = cep;
        this.rua = nomeDaRua;
        this.numero = numero;
        this.complemento = complemento;
    }

    Endereco() {}

    public String enderecoFormatado() {
        return rua + ", " + numero + " " + complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
