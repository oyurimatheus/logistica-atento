package br.com.fiap.logisticaatento.dto;

import br.com.fiap.logisticaatento.dados.Endereco;
import br.com.fiap.logisticaatento.dados.Nome;
import br.com.fiap.logisticaatento.modelo.Fretado;
import br.com.fiap.logisticaatento.modelo.Funcionario;
import br.com.fiap.logisticaatento.modelo.MeioDeTransporte;

import java.math.BigDecimal;
import java.time.LocalTime;

public class FuncionarioForm {

    private final String primeiroNome;
    private final String sobrenome;
    private final String cep;
    private final String rua;
    private final String numero;
    private final String complemento;
    private final LocalTime horarioDeTrabalho;
    private LocalTime horaDeSaida;
    private BigDecimal gastoComTransporte;
    private MeioDeTransporte meioDeTransporte;
    private Fretado fretado;


    public FuncionarioForm(String primeiroNome, String sobrenome, String cep, String rua, String numero, String complemento, LocalTime horarioDeTrabalho, LocalTime horaDeSaida, BigDecimal gastoComTransporte, MeioDeTransporte meioDeTransporte, Fretado fretado) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.horarioDeTrabalho = horarioDeTrabalho;
        this.horaDeSaida = horaDeSaida;
        this.gastoComTransporte = gastoComTransporte;
        this.meioDeTransporte = meioDeTransporte;
        this.fretado = fretado;
    }

    public Funcionario build() {
        return new Funcionario(new Nome(primeiroNome, sobrenome),
                               new Endereco(cep, rua, numero, complemento),
                               horarioDeTrabalho, horaDeSaida, gastoComTransporte, meioDeTransporte, fretado);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public LocalTime getHoraDeTrabalho() {
        return horarioDeTrabalho;
    }
}
