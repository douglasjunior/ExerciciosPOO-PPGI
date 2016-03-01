package br.edu.utfpr.cp.pooex09;

import br.edu.utfpr.cp.pooex09.model.AreaCalculavel;
import br.edu.utfpr.cp.pooex09.model.Circulo;
import br.edu.utfpr.cp.pooex09.model.Quadrado;
import br.edu.utfpr.cp.pooex09.model.Retangulo;
import br.edu.utfpr.cp.pooex09.model.Trapezio;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {
        AreaCalculavel[] calculaveis = new AreaCalculavel[4];
        calculaveis[0] = new Circulo(5);
        calculaveis[1] = new Retangulo(5, 10);
        calculaveis[2] = new Quadrado(5);
        calculaveis[3] = new Trapezio(5, 8, 10);

        for (AreaCalculavel calculavel : calculaveis) {
            System.out.println(calculavel.getClass().getSimpleName() + ": " + calculavel.calculaArea());
        }
    }

}
