package br.edu.utfpr.cp.pooex02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class FilaTest {
    
    public FilaTest() {
    }
   
    @Test
    public void adicionarTest(){
        Fila<String> fila = new Fila();
        fila.adicionar("teste1");
        fila.adicionar("teste2");
        
        String primeiro = fila.avancar();
        
        assertEquals("teste1", primeiro);
    }
   
    @Test
    public void avancarTest(){
        Fila<String> fila = new Fila();
        fila.adicionar("teste1");
        fila.adicionar("teste2");
        
        String primeiro = fila.avancar();
        
        assertEquals("teste1", primeiro);
        
        String segundo = fila.avancar();
        
        assertEquals("teste2", segundo);
    }
    
    
    @Test
    public void vazioTest(){
        Fila<String> fila = new Fila();
        
        assertTrue(fila.vazio());
        
        fila.adicionar("teste1");
        fila.adicionar("teste2");
        
        assertFalse(fila.vazio());
        
        String primeiro = fila.avancar();
        String segundo = fila.avancar();
        
        assertTrue(fila.vazio());
    }
}
