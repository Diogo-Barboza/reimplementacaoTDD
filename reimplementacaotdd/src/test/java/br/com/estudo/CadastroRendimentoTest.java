package br.com.estudo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastroRendimentoTest {

    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarSalario() {
        irpf.cadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);;
    }

    @Test
    public void testCadastrarSalario2() {
        irpf.cadastrarSalario(6000f);
        assertEquals(6000f, irpf.getTotalSalario(), 0);;
    }

    @Test
    public void testCadastrarSalario3() {
        irpf.cadastrarSalario(5000f);
        irpf.cadastrarSalario(6000f);
        assertEquals(11000f, irpf.getTotalSalario(), 0);;
    }
}
