package br.com.fiap.logisticaatento.modelo;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "fretados")
@Entity
public class Fretado {

    @Column(name = "id_fretado")
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "horario_de_partida")
    private LocalTime horarioDePartida;
    private Integer capacidade;

    @ManyToMany(cascade = ALL)
    @JoinTable(
            name = "fretados_rotas",
            joinColumns = @JoinColumn(name = "id_fretado"),
            inverseJoinColumns = { @JoinColumn(name = "id_rota") }
    )
    private List<Rota> rotas;

    public Fretado(LocalTime horarioDePartida, Integer capacidade, List<Rota> rotas) {
        this.horarioDePartida = horarioDePartida;
        this.capacidade = capacidade;
        this.rotas = rotas;
    }


    Fretado() {}

    public Integer getId() {
        return id;
    }

    public LocalTime getHorarioDePartida() {
        return horarioDePartida;
    }

    public Integer getCapacidade() {
        return capacidade;
    }
}
