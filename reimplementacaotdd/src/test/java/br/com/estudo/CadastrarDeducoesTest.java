package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastrarDeducoesTest {

    private IRPF irpf;

    @BeforeEach
    public void setup() {
        irpf = new IRPF();
    }
    
    @Test
    public void testCadastrarPrevidenciaOficial() {
        irpf.cadastrarPrevidenciaOficial(700f); 
        assertEquals(700f, irpf.getPrevidenciaSocial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaOficial2() {
        irpf.cadastrarPrevidenciaOficial(800f); 
        assertEquals(800f, irpf.getPrevidenciaSocial(), 0);
    }

    public void testCadastrarPrevidenciaOficial3() {
        irpf.cadastrarPrevidenciaOficial(900f); 
        assertEquals(900f, irpf.getPrevidenciaSocial(), 0);
    }
}

