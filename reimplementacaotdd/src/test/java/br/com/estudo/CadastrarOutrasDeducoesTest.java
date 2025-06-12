package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastrarOutrasDeducoesTest {

    private IRPF irpf;
    
    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarOutrasDeducoes(){
        irpf.cadastrarOutrasDeducoes(250f);
        assertEquals(250f, irpf.getTotalOutrasDeducoes(), 0);
    }

    @Test
    public void testCadastrarOutrasDeducoes2(){
        irpf.cadastrarOutrasDeducoes(500f);
        assertEquals(500f, irpf.getTotalOutrasDeducoes(), 0);
    }

    @Test
    public void testCadastrarOutrasDeducoes3(){
        irpf.cadastrarOutrasDeducoes(250f);
        irpf.cadastrarOutrasDeducoes(500f);
        irpf.cadastrarOutrasDeducoes(100f);
        assertEquals(850f, irpf.getTotalOutrasDeducoes(), 0);
    }

}
