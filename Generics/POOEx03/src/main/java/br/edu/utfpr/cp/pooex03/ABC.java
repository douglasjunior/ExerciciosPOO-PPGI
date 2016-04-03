package br.edu.utfpr.cp.pooex03;

/**
 *
 * @author Douglas
 */
public class ABC extends A implements B, C {

    @Override
    public void imprimirA() {
        System.out.println("A");
    }

    @Override
    public void imprimirB() {
        System.out.println("B");
    }

    @Override
    public void imprimirC() {
        System.out.println("C");
    }

}
