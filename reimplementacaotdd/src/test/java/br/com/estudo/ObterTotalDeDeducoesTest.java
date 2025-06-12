package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObterTotalDeDeducoesTest {
    
    private IRPF irpf;
    
    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testSomadeDeducoes(){
        irpf.cadastrarPrevidenciaOficial(400f);
        irpf.cadastrarDependente("Mirela");
        irpf.cadastrarPensaoAlimenticia(150f);
        irpf.cadastrarOutrasDeducoes(50f);

        assertEquals(600f + 189.59f, irpf.getTotalDeducoes(), 0);
    }

    @Test
    public void testSomadeDeducoes2(){
        irpf.cadastrarPrevidenciaOficial(100f);
        irpf.cadastrarDependente("Mirela");
        irpf.cadastrarPensaoAlimenticia(0f);
        irpf.cadastrarOutrasDeducoes(0f);

        assertEquals(100f + 189.59f, irpf.getTotalDeducoes(), 0);
    }

    @Test
    public void testSomadeDeducoes3(){
        irpf.cadastrarPrevidenciaOficial(600f);
        irpf.cadastrarDependente("Mirela");
        irpf.cadastrarDependente("Diogo");
        irpf.cadastrarPensaoAlimenticia(150f);
        irpf.cadastrarPensaoAlimenticia(200f);
        irpf.cadastrarOutrasDeducoes(50f);
        irpf.cadastrarOutrasDeducoes(100f);

        assertEquals(350f + 150f + 600f + (2f * 189.59f), irpf.getTotalDeducoes(), 0.001);
    }

}

