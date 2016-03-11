package br.edu.utfpr.cp.pooex09;

import java.util.Comparator;

/**
 * Compara por ordem de tamanho do nome da Fruta.
 *
 * @author Douglas
 */
public class ComparaPorTamanho implements Comparator<Fruta> {

    @Override
    public int compare(Fruta o1, Fruta o2) {
        if (o1.getNome().length() < o2.getNome().length()) {
            return -1;
        }
        if (o1.getNome().length() > o2.getNome().length()) {
            return 1;
        }
        return 0;
    }
}
