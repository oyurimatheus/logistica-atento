package br.com.fiap.logisticaatento.dto;

import br.com.fiap.logisticaatento.dados.Endereco;
import br.com.fiap.logisticaatento.dados.Nome;
import br.com.fiap.logisticaatento.modelo.Funcionario;
import br.com.fiap.logisticaatento.repository.FretadoRepository;
import br.com.fiap.logisticaatento.repository.MeioDeTransporteRepository;

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
    private Long meioDeTransporte;
    private Long fretado;

    private MeioDeTransporteRepository meioDeTransporteRepository;
    private FretadoRepository fretadoRepository;


    public FuncionarioForm(String primeiroNome, String sobrenome, String cep, String rua, String numero, String complemento, LocalTime horarioDeTrabalho, LocalTime horaDeSaida, BigDecimal gastoComTransporte, Long meioDeTransporte, Long fretado, MeioDeTransporteRepository meioDeTransporteRepository, FretadoRepository fretadoRepository) {
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
        this.meioDeTransporteRepository = meioDeTransporteRepository;
        this.fretadoRepository = fretadoRepository;
    }

    public Funcionario build() {
        return new Funcionario(new Nome(primeiroNome, sobrenome),
                               new Endereco(cep, rua, numero, complemento),
                               horarioDeTrabalho, horaDeSaida, gastoComTransporte,
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
        return horarioDeTrabalho;
    }
}
