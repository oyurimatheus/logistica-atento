package br.com.fiap.logisticaatento.modelo;

import org.junit.jupiter.api.Test;
import br.com.fiap.logisticaatento.modelo.Nome;
import br.com.fiap.logisticaatento.modelo.Endereco;

import static org.junit.Assert.assertEquals;

public class FuncionarioTest {
    @Test
    public void deveRetornarNomeCompleto() {
        Nome nomeTeste = new Nome("Antonio","Selmini");
        Funcionario funcionario = new Funcionario(1,nomeTeste,null,null);

        Nome nomeEsperado = new Nome("Antonio","Selmini");
        Funcionario funciorarioEsperado = new Funcionario(1,nomeEsperado,null,null);

        assertEquals(funciorarioEsperado.getNome().getNomeCompleto(), funcionario.getNome().getNomeCompleto());
    }

    @Test
    public void gravaDadosDoEndereco() {

        Endereco enderecoTeste = new Endereco("05626070","Rua dos inteligentes",40,"Casa");
        Funcionario funcionario = new Funcionario(1,null,enderecoTeste,null);

        Endereco enderecoEsperado = new Endereco("05626070","Rua dos inteligentes",40,"Casa");
        Funcionario funcionarioEsperado = new Funcionario(1,null,enderecoEsperado,null);

        assertEquals(funcionarioEsperado.getEndereco().getNumero(), funcionario.getEndereco().getNumero());
    }



}
