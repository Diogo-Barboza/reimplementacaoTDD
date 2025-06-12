package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastrarDependentesTest {
    
    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarUmDependente(){
        irpf.cadastrarDependente ("Joao");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependentes(){
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentes(){
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("maria");
        irpf.cadastrarDependente("jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
        public void testCadastrarCincoDependentes(){
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        irpf.cadastrarDependente("Maria Jose");
        irpf.cadastrarDependente("Jose Maria");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}
