package br.edu.utfpr.cp.pooex10;

import java.util.Stack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class PilhaTest {

    public PilhaTest() {
    }

    private Stack<Fruta> pilha;

    @Before
    public void setUp() {
        pilha = new Stack<>();
        pilha.add(new Fruta("MELANCIA"));
        pilha.add(new Fruta("JABUTICABA"));
        pilha.add(new Fruta("UVA"));
        pilha.add(new Fruta("LIMAO"));
        pilha.add(new Fruta("ABACATE"));
    }

    /**
     * Retorna o último elemento adicionado a pilha sem remover.
     */
    @Test
    public void peekTest() {
        Fruta f = pilha.peek();

        assertEquals("ABACATE", f.getNome());

        Fruta f2 = pilha.peek();

        assertEquals(f, f2);
    }

    /**
     * Retorna e remove o último elemento adicionado a pilha.
     */
    @Test
    public void popTest() {
        Fruta f = pilha.pop();

        assertEquals("ABACATE", f.getNome());

        Fruta f2 = pilha.peek();

        assertNotEquals(f, f2);
    }

    /**
     * Insere um elemento no topo da pilha.
     */
    @Test
    public void pushTest() {
        Fruta laranja = new Fruta("LARANJA");

        pilha.push(laranja);

        Fruta f = pilha.pop();

        assertEquals(laranja, f);

        Fruta f2 = pilha.peek();

        assertNotEquals(f2, laranja);
    }
}
