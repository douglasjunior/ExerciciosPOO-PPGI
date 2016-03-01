package br.edu.utfpr.cp.pooex04.model;

/**
 *
 * @author Douglas
 */
public final class Secretaria extends NovoEmpregado {

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
}
