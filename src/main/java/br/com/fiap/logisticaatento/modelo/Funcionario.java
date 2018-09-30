package br.com.fiap.logisticaatento.modelo;

import java.math.BigDecimal;
import java.time.LocalTime;

import br.com.fiap.logisticaatento.dados.Nome;
import br.com.fiap.logisticaatento.dados.Endereco;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "usuarios")
@Entity
public class Funcionario {

    @Column(name = "id_usuario")
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Embedded
    private Nome nome;

    @Embedded
    private Endereco endereco;

    @Column(name = "horario_entrada")
    private LocalTime horaDeEntrada;

    @Column(name = "horario_saida")
    private LocalTime horaDeSaida;

    private String cargo;

    @Column(name = "gasto_com_transporte")
    private BigDecimal gastoComTransporte;

    @ManyToOne
    @JoinColumn(name = "id_mt")
    private MeioDeTransporte meioDeTransporte;

    @ManyToOne
    @JoinColumn(name = "id_fretado")
    private Fretado fretado;


    public Funcionario(Nome nome, Endereco endereco, LocalTime horaDeEntrada, LocalTime horaDeSaida, BigDecimal gastoComTransporte, MeioDeTransporte meioDeTransporte, Fretado fretado) {
        this.nome = nome;
        this.endereco = endereco;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSaida = horaDeSaida;
        this.gastoComTransporte = gastoComTransporte;
        this.meioDeTransporte = meioDeTransporte;
        this.fretado = fretado;
    }

    Funcionario() {}

    public String nomeCompleto(){
        return nome.getNomeCompleto();
    }

    public String enderecoSimplificado() {
        return endereco.enderecoFormatado();
    }

    public Integer getId() {
        return id;
    }

    public Nome getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public LocalTime getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public LocalTime getHoraDeSaida() {
        return horaDeSaida;
    }

    public BigDecimal getGastoComTransporte() {
        return gastoComTransporte;
    }

    public MeioDeTransporte getMeioDeTransporte() {
        return meioDeTransporte;
    }

    public Fretado getFretado() {
        return fretado;
    }
}
