package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObterAliquotaFinalTest {
    
    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testObterAliquota(){
        irpf.cadastrarSalario(900f);

        assertEquals(0f, irpf.getAliquotaFinal(), 0.0001);
    }

    @Test
    public void testObterAliquota2(){
        irpf.cadastrarSalario(1000f);

        assertEquals(0.75f, irpf.getAliquotaFinal(), 0.0001);
    }

    @Test
    public void testObterAliquota3(){
        irpf.cadastrarSalario(2000f);

        assertEquals(4.125f, irpf.getAliquotaFinal(), 0.0001);
    }

    @Test
    public void testObterAliquota4(){
        irpf.cadastrarSalario(3000f);

        assertEquals(8f, irpf.getAliquotaFinal(), 0.0001);
    }

    @Test
    public void testObterAliquota5(){
        irpf.cadastrarSalario(10000f);

        assertEquals(21.2f, irpf.getAliquotaFinal(), 0.0001);
    }
}
