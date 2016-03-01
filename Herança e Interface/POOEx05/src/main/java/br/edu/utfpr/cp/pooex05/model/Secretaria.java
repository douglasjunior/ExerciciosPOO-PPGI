package br.edu.utfpr.cp.pooex05.model;

/**
 *
 * @author Douglas
 */
public final class Secretaria extends Empregado {

    private boolean noturno;

    public Secretaria(String nome, double salario) {
        super();
        noturno = false;
        setNome(nome);
        setSalario(salario);
    }

    public void setNoturno(boolean noturno) {
        this.noturno = noturno;
    }

    public boolean getNoturno() {
        return noturno;
    }

    @Override
    public final void reajusteSalario(double valor) {
        if (noturno) {
            setSalario(350 + valor + getSalario());
        } else {
            setSalario(valor + getSalario());
        }
    }

    @Override
    public String toString() {
        return "Secretária: " + getNome() + " Salário: " + getSalario() + " Noturno: " + (noturno ? "Sim" : "Não");
    }
}
