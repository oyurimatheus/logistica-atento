package br.com.fiap.logisticaatento.dto;

import br.com.fiap.logisticaatento.dados.Endereco;
import br.com.fiap.logisticaatento.dados.Nome;
import br.com.fiap.logisticaatento.modelo.Funcionario;
import br.com.fiap.logisticaatento.repository.FretadoRepository;
import br.com.fiap.logisticaatento.repository.MeioDeTransporteRepository;

import java.math.BigDecimal;
import java.time.LocalTime;

public class FuncionarioForm {

    private String primeiroNome;
    private String sobrenome;
    private String cep;
    private String rua;
    private String numero;
    private String complemento;
    private LocalTime horarioDeEntrada;
    private LocalTime horarioDeSaida;
    private BigDecimal gastoComTransporte;
    private Integer meioDeTransporte;
    private Integer fretado;

    public FuncionarioForm(String primeiroNome, String sobrenome, String cep, String rua, String numero, String complemento, LocalTime horarioDeEntrada, LocalTime horarioDeSaida, BigDecimal gastoComTransporte, Integer meioDeTransporte, Integer fretado) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.horarioDeEntrada = horarioDeEntrada;
        this.horarioDeSaida = horarioDeSaida;
        this.gastoComTransporte = gastoComTransporte;
        this.meioDeTransporte = meioDeTransporte;
        this.fretado = fretado;
    }

    public Funcionario build(MeioDeTransporteRepository meioDeTransporteRepository, FretadoRepository fretadoRepository) {

        return new Funcionario(new Nome(primeiroNome, sobrenome),
                               new Endereco(cep, rua, numero, complemento),
                horarioDeEntrada, horarioDeSaida, gastoComTransporte,
                               meioDeTransporteRepository.findById(meioDeTransporte).get(),
                               fretadoRepository.findById(fretado).get());
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
        return horarioDeEntrada;
    }
}
