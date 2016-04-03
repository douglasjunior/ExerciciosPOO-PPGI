package br.edu.utfpr.cp.pooex01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 * @param <T>
 */
public class Pilha<T> {

    private final List<T> lista = new ArrayList<>();

    public void empilhar(T object) {
        lista.add(object);
    }

    public T desempilhar() {
        return lista.remove(lista.size() - 1);
    }

    public boolean vazio() {
        return lista.isEmpty();
    }
}
