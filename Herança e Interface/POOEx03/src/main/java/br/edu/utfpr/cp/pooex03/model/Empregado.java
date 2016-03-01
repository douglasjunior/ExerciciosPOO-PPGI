package br.edu.utfpr.cp.pooex03.model;

/**
 *
 * @author Douglas
 */
public class Empregado {
    // acho que Empregado poderia ser uma classe abstrata, 
    // pois não faz sentido instancia-lo diretamente

    private String nome;
    private double salario;

    public Empregado() {
        nome = "";
        salario = 0;
    }

    public final double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = (salario >= 0) ? salario : 0;
    }

    protected final void setNome(String nome) {
        this.nome = (nome != null) ? nome : "";
    }

    public final String getNome() {
        return nome;
    }

    // E este poderia ser um método abstrato
    protected void reajusteSalario(double valor) {
        //código a ser implementado em subclasses
    }
}
