package br.edu.utfpr.cp.pooex03;

import br.edu.utfpr.cp.pooex03.model.Programador;
import br.edu.utfpr.cp.pooex03.model.Secretaria;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {
        Programador p = new Programador("Fulano", 500.55);
        p.setPesoSalario(0.02);
        p.reajusteSalario(200);
        System.out.println("Nome: " + p.getNome() + ", Salário: " + p.getSalario());
        Secretaria s = new Secretaria("Beltrana", 200.55);
        s.setNoturno(true);
        s.reajusteSalario(100);
        System.out.println("Nome: " + s.getNome() + ", Salário: " + s.getSalario());
    }
}
