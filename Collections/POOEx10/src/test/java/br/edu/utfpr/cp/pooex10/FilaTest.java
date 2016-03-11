package br.edu.utfpr.cp.pooex10;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class FilaTest {

    public FilaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    private Queue<Fruta> fila;

    @Before
    public void setUp() {
        fila = new ConcurrentLinkedQueue<>();
        fila.add(new Fruta("MELANCIA"));
        fila.add(new Fruta("JABUTICABA"));
        fila.add(new Fruta("UVA"));
        fila.add(new Fruta("LIMAO"));
        fila.add(new Fruta("ABACATE"));
    }

    /**
     * Devolve o primeiro elemento sem remover.
     */
    @Test
    public void peekTest() {
        Fruta f = fila.peek();

        assertEquals("MELANCIA", f.getNome());

        Fruta f2 = fila.peek();

        assertEquals(f, f2);
    }

    /**
     * Devolve e remove o primeiro elemento.
     */
    @Test
    public void pollTest() {
        Fruta f = fila.poll();

        assertEquals("MELANCIA", f.getNome());

        Fruta f2 = fila.peek();

        assertNotEquals(f, f2);
    }
}
