package br.com.estudo;

public class IRPF {

    private float salario;
    private float contribuicaoPrevidenciaria;
    private String[] dependentes;
    private float pensao;
    private float outraDeducao;

    public IRPF(){
        dependentes = new String[0];
    }

    public void cadastrarSalario(float salario){
        this.salario += salario;
    }
    
    public float getTotalSalario(){
        return this.salario;
    }

    public void cadastrarPrevidenciaOficial(float contribuicaoPrevidencia) {
        this.contribuicaoPrevidenciaria = contribuicaoPrevidencia;
    }

    public float getPrevidenciaSocial(){
        return this.contribuicaoPrevidenciaria;
    }

    public void cadastrarDependente(String nome){
        // Criar uma nova posicao no vetor de dependentes
        String[] temp = new String[dependentes.length + 1]; 
        for(int i=0; i<dependentes.length; i++){
            temp[i] = dependentes[i];
        }
        // Alocar novo dependente no vetor
        temp[dependentes.length] = nome;

        // atualizar referencias do vetor de dependetes
        dependentes = temp;
    }

    public float getDeducaoDependentes(){
        return dependentes.length * 189.59f;
    }

    public void cadastrarPensaoAlimenticia(float pensao) {
        this.pensao += pensao;
    }

    public float getPensaoAlimenticia(){
        return pensao;
    }

    public void cadastrarOutrasDeducoes(float outraDeducao) {
        this.outraDeducao += outraDeducao;
    }

    public float getTotalOutrasDeducoes(){
        return outraDeducao;
    }

    public float getTotalDeducoes() {
        float total = 0;
        total += outraDeducao + pensao + (dependentes.length * 189.59) + contribuicaoPrevidenciaria;
        return total;
    }

}
