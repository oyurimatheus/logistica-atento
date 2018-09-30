package br.com.fiap.logisticaatento.modelo;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "rotas")
@Entity
public class Rota {

    @Column(name = "id_rota")
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private BigDecimal custo;

    @Column(name = "tempo_decorrido")
    private LocalTime tempoDecorrido;

    private Integer distancia;

    @ManyToMany(mappedBy = "rotas")
    private List<Fretado> fretados;

    public Rota(BigDecimal custo, LocalTime tempoDecorrido, Integer distancia, List<Fretado> fretados) {
        this.custo = custo;
        this.tempoDecorrido = tempoDecorrido;
        this.distancia = distancia;
        this.fretados = fretados;
    }

    Rota() {}

    public Integer getId() {
        return id;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public LocalTime getTempoDecorrido() {
        return tempoDecorrido;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public List<Fretado> getFretados() {
        return fretados;
    }
}
