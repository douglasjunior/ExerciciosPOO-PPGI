package br.edu.utfpr.cp.pooex05.model;

/**
 *
 * @author Douglas
 */
public class Programador extends Empregado {

    private double peso_salario;

    public Programador(String nome, double salario) {
        super();
        peso_salario = 0;
        setNome(nome);
        setSalario(salario);
    }

    public double getPesoSalario() {
        return peso_salario;
    }

    public void setPesoSalario(double peso_salario) {
        if (peso_salario >= 0 && peso_salario <= 0.1) {
            this.peso_salario = peso_salario;
        } else {
            throw new IllegalArgumentException("Peso não está entre 0 e 0.1: "
                    + peso_salario);
        }
    }

    @Override
    public final void reajusteSalario(double valor) {
        setSalario(valor + (1 + peso_salario) * getSalario());
    }

    @Override
    public String toString() {
        return "Programador: " + getNome() + " Salário: " + getSalario() + " Peso Salário: " + getPesoSalario();
    }
}
