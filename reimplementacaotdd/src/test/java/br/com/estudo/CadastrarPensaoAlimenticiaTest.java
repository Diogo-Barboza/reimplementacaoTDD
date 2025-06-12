package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastrarPensaoAlimenticiaTest {
    
    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarPensaoAlimenticia(){
        irpf.cadastrarPensaoAlimenticia(300f);
        assertEquals(300f, irpf.getPensaoAlimenticia(), 0);
    }

    @Test
    public void testCadastrarPensaoAlimenticia2(){
        irpf.cadastrarPensaoAlimenticia(600f);
        assertEquals(600f, irpf.getPensaoAlimenticia(), 0);
    }

    @Test
    public void testCadastrarPensaoAlimenticia3(){
        irpf.cadastrarPensaoAlimenticia(300f);
        irpf.cadastrarPensaoAlimenticia(600f);
        assertEquals(900f, irpf.getPensaoAlimenticia(), 0);
    }

}
