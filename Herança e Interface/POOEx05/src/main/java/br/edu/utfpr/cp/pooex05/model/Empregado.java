package br.edu.utfpr.cp.pooex05.model;

/**
 *
 * @author Douglas
 */
public abstract class Empregado {

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

    protected abstract void reajusteSalario(double valor);
}
