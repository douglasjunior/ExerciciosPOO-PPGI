package br.edu.utfpr.cp.pooex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Douglas
 */
public class ConjuntosTest {

    public ConjuntosTest() {
    }

    private Set<String> conjuntoA;
    private Set<String> conjuntoB;

    @Before
    public void setUp() {
        conjuntoA = new HashSet<>(Arrays.asList("UVA", "MELANCIA", "LARANJA", "ACEROLA", "JABUTICABA"));
        conjuntoB = new HashSet<>(Arrays.asList("ABACATE", "MELANCIA", "LARANJA", "LIMÃO", "JABUTICABA"));
    }

    @Test
    public void uniaoTest() {
        Set<String> resultado = new HashSet<>();
        Conjuntos.uniao(conjuntoA, conjuntoB, resultado);
        
        assertTrue(resultado.containsAll(conjuntoA));
        assertTrue(resultado.containsAll(conjuntoB));
    }
    
    @Test
    public void intersecaoTest() {
        Set<String> resultado = new HashSet<>();
        Conjuntos.intersecao(conjuntoA, conjuntoB, resultado);
        
        assertFalse(resultado.contains("UVA"));
        assertFalse(resultado.contains("ABACATE"));
        assertTrue(resultado.contains("JABUTICABA"));
    }
    
    @Test
    public void diferencaTest() {
        Set<String> resultado = new HashSet<>();
        Conjuntos.diferenca(conjuntoA, conjuntoB, resultado);
        
        assertTrue(resultado.contains("UVA"));
        assertTrue(resultado.contains("ACEROLA"));
        assertFalse(resultado.contains("JABUTICABA"));
    }
}
