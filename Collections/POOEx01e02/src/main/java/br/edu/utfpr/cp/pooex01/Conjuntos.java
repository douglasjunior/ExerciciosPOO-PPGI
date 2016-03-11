package br.edu.utfpr.cp.pooex01;

import java.util.Set;

/**
 *
 * @author Douglas
 */
public class Conjuntos {

    /**
     *
     * @param conjuntoA
     * @param conjuntoB
     * @param resultado Terá todos os elementos de A + B
     */
    public static void uniao(Set conjuntoA, Set conjuntoB, Set resultado) {
        resultado.addAll(conjuntoA);
        resultado.addAll(conjuntoB);
    }

    /**
     *
     * @param conjuntoA
     * @param conjuntoB
     * @param resultado Terá somente os elementos que existem em A e também em B
     */
    public static void intersecao(Set conjuntoA, Set conjuntoB, Set resultado) {
        for (Object o : conjuntoA) {
            if (conjuntoB.contains(o)) {
                resultado.add(o);
            }
        }
    }

    /**
     *
     * @param conjuntoA
     * @param conjuntoB
     * @param resultado Terá todos os elementos de A que não estão em B
     */
    public static void diferenca(Set conjuntoA, Set conjuntoB, Set resultado) {
        for (Object o : conjuntoA) {
            if (!conjuntoB.contains(o)) {
                resultado.add(o);
            }
        }
    }

}
