package br.com.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObterBaseDeCalculo {
    
    private IRPF irpf;

    @BeforeEach
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testBaseDeCalculo(){
        irpf.cadastrarSalario(2000f);
        irpf.cadastrarPrevidenciaOficial(400f);
        irpf.cadastrarDependente("Mirela");
        irpf.cadastrarPensaoAlimenticia(150f);
        irpf.cadastrarOutrasDeducoes(50f);

        assertEquals(2000f - (400f + 189.59f + 200f), irpf.getBaseDeCaculo(), 0.001);
    }

    @Test
    public void testBaseDeCalculo2(){
        irpf.cadastrarSalario(2500f);
        irpf.cadastrarPrevidenciaOficial(600f);
        irpf.cadastrarDependente("Mirela");
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarPensaoAlimenticia(100f);
        irpf.cadastrarOutrasDeducoes(150f);

        assertEquals(2500f - (600f + (2 * 189.59f) + 250f), irpf.getBaseDeCaculo(), 0.001);
    }

    @Test
    public void testBaseDeCalculo3(){
        irpf.cadastrarSalario(2000f);
        irpf.cadastrarSalario(3000f);
        irpf.cadastrarPrevidenciaOficial(600f);
        irpf.cadastrarDependente("Mirela");
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Diogo");
        irpf.cadastrarPensaoAlimenticia(100f);
        irpf.cadastrarPensaoAlimenticia(200f);
        irpf.cadastrarOutrasDeducoes(150f);
        irpf.cadastrarOutrasDeducoes(200f);

        assertEquals(5000f - (600f + (3 * 189.59f) + 650f), irpf.getBaseDeCaculo(), 0.001);
    }



}
