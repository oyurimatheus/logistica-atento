package br.com.fiap.logisticaatento.repository;

import br.com.fiap.logisticaatento.modelo.Fretado;
import br.com.fiap.logisticaatento.modelo.MeioDeTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FretadoRepository extends JpaRepository<Fretado, Long> {

}