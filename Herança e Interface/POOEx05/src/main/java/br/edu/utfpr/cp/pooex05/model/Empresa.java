package br.edu.utfpr.cp.pooex05.model;

/**
 *
 * @author Douglas
 */
public class Empresa {

    private Empregado[] empregados;
    private int i;

    public Empresa(int tamanho) {
        this.empregados = new Empregado[tamanho];
        this.i = 0;
    }

    public void insereEmpregado(Empregado e) {
        this.empregados[i] = e;
        i++;
    }

    public void fazerReajusteSalarial(double valor) {
        for (Empregado empregado : empregados) {
            empregado.reajusteSalario(valor);
        }
    }

    public void mostrarFuncionarios() {
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
    
}
