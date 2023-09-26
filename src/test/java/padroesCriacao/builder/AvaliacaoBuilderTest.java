package padroesCriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoBuilderTest {

    @Test
    void deveLancarExcessaoCodDefault(){
        try{
            AvaliacaoBuilder avBuilder = new AvaliacaoBuilder();
            Avaliacao avaliacao = avBuilder.setCodAluno(-1).build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Codigo padrao", e.getMessage());
        }
    }

    @Test
    void deveLancarExcessaoCodInvalido(){
        try{
            AvaliacaoBuilder avBuilder = new AvaliacaoBuilder();
            Avaliacao avaliacao = avBuilder.setCodAluno(-10).build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Codigo incorreto", e.getMessage());
        }
    }

    @Test
    void deveRetornarAvaliacaoValidada(){
        AvaliacaoBuilder avBuilder = new AvaliacaoBuilder();
        Avaliacao avaliacao = avBuilder.setCodAluno(10).build();
    }

}