package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObterImpostoPorfaixaTest {

    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testObterImposto(){
        irpf.cadastrarSalario(900f);
        
        assertEquals(0f, irpf.getImpostoPorFaixa(), 0);
    }

    @Test
    public void testObterImposto2(){
        irpf.cadastrarSalario(1000f);
        
        assertEquals(7.5f, irpf.getImpostoPorFaixa(), 0.1);
    }

    @Test
    public void testObterImposto3(){
        irpf.cadastrarSalario(2000f);
        
        assertEquals(82.5f, irpf.getImpostoPorFaixa(), 0.1);
    }

    @Test
    public void testObterImposto4(){
        irpf.cadastrarSalario(3000f);
        
        assertEquals(240f, irpf.getImpostoPorFaixa(), 0.1);
    }

    @Test
    public void testObterImposto5(){
        irpf.cadastrarSalario(10000f);
        
        assertEquals(2120f, irpf.getImpostoPorFaixa(), 0.1);
    }
    
}
