package br.edu.utfpr.cp.pooex05;

import br.edu.utfpr.cp.pooex05.model.Empresa;
import br.edu.utfpr.cp.pooex05.model.Programador;
import br.edu.utfpr.cp.pooex05.model.Secretaria;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {
        Empresa geral = new Empresa(3);
        Programador p1 = new Programador("Fulano", 500.55);
        p1.setPesoSalario(0.02);
        Secretaria s1 = new Secretaria("Ciclana", 250.10);
        s1.setNoturno(true);
        Programador p2 = new Programador("Beltrano", 500.55);
        p2.setPesoSalario(0.1);
        geral.insereEmpregado(p1);
        geral.insereEmpregado(s1);
        geral.insereEmpregado(p2);
        geral.fazerReajusteSalarial(200);
        geral.mostrarFuncionarios(); //implemente métodos toString() para as classes.
    }
}
