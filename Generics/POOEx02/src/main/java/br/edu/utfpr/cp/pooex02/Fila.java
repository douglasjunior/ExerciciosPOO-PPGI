package br.edu.utfpr.cp.pooex02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class Fila<T> {

    private List<T> lista = new ArrayList<>();

    public void adicionar(T object) {
        lista.add(0, object);
    }

    public boolean vazio() {
        return lista.isEmpty();
    }

    public T avancar() {
        return lista.remove(lista.size() - 1);
    }

}
