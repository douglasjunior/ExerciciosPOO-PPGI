package br.edu.utfpr.cp.pooex07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class ListTest {

    public ListTest() {
    }

    /*
    Resposta:
    A diferença entre ArrayList e LinkedList, é que a primeira é uma lista dinamica 
    que trabalha internamente com um array nativo, e a segunda é implementada como
    uma lista encadeada.
    - ArrayList é rápida para buscar e pode ser lenta para adicionar ou remover elementos.
    - LinkedList é lenta para buscar e rápida para adicionar ou remover elementos.
     */
    @Test
    public void linkedListTest() {
        LinkedList<String> lista = new LinkedList<>(Arrays.asList("UVA", "MELANCIA", "LARANJA", "ACEROLA", "JABUTICABA"));

        String abacate = "ABACATE";
        lista.addFirst(abacate);
        assertEquals(abacate, lista.get(0));

        String limao = "LIMAO";
        lista.addLast(limao);
        assertEquals(limao, lista.get(lista.size() - 1));
        
        String goiaba = "GOIABA";
        lista.addFirst(goiaba);
        assertEquals(goiaba, lista.getFirst());

        lista.removeFirst();
        assertNotEquals(goiaba, lista.getFirst());
        
        String lixia = "LIXIA";
        lista.addLast(lixia);
        assertEquals(lixia, lista.getLast());

        lista.removeLast();
        assertNotEquals(lixia, lista.getLast());
        
        
    }
}
