package br.edu.utfpr.cp.pooex03;

/**
 *
 * @author Douglas
 * @param <T>
 */
public class Imprimir<T extends A & B & C> {

    public void imprimir(T object) {
        object.imprimirA();
        object.imprimirB();
        object.imprimirC();
    }

}
