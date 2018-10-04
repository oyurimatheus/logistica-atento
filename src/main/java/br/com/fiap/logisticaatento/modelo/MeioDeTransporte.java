package br.com.fiap.logisticaatento.modelo;

import javax.persistence.*;

import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "meios_de_transporte")
@Entity
public class MeioDeTransporte {

    @Column(name = "id_mt")
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "nome_transporte")
    private String nome;

    private BigDecimal custo;

    public MeioDeTransporte(String nome, BigDecimal custo) {
        this.nome = nome;
        this.custo = custo;
    }

    MeioDeTransporte() {}

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getCusto() {
        return custo;
    }
}
