package br.edu.utfpr.cp.pooex01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class PilhaTest {

    public PilhaTest() {
    }

    @Test
    public void empilharStringTest() {
        Pilha<String> pilha = new Pilha();
        pilha.empilhar("teste1");
        pilha.empilhar("teste2");        
        
        assertEquals("teste2", pilha.desempilhar());
        assertEquals("teste1", pilha.desempilhar());
    }
    
    @Test
    public void empilharInteiroTest() {
        Pilha<Integer> pilha = new Pilha();
        pilha.empilhar(1);
        pilha.empilhar(2);        
        
        assertEquals(new Integer(2), pilha.desempilhar());
        assertEquals(new Integer(1), pilha.desempilhar());
    }

    @Test
    public void vazioTest() {
        Pilha<String> pilhaString = new Pilha();
        
        assertTrue(pilhaString.vazio());
        
        pilhaString.empilhar("primeiro");
        
        assertFalse(pilhaString.vazio());
        
        pilhaString.desempilhar();
        
        assertTrue(pilhaString.vazio());
    }

}
