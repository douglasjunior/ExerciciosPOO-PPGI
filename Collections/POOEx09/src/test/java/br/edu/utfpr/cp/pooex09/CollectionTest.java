package br.edu.utfpr.cp.pooex09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class CollectionTest {

    public CollectionTest() {
    }

    private ComparaPorTamanho comparaPorTamanho = new ComparaPorTamanho();
    private Collection<Fruta> collection;

    @Before
    public void setUp() {
        collection = new ArrayList<>();
        collection.add(new Fruta("MELANCIA"));
        collection.add(new Fruta("JABUTICABA"));
        collection.add(new Fruta("UVA"));
        collection.add(new Fruta("LIMAO"));
        collection.add(new Fruta("ABACATE"));
    }

    @Test
    public void comparableTest() {
        assertEquals("ABACATE", Collections.min(collection).getNome());
        assertEquals("UVA", Collections.max(collection).getNome());
    }

    @Test
    public void comparatorTest() {
        assertEquals("UVA", Collections.min(collection, comparaPorTamanho).getNome());
        assertEquals("JABUTICABA", Collections.max(collection, comparaPorTamanho).getNome());
    }
}
