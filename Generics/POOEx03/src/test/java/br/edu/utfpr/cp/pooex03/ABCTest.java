package br.edu.utfpr.cp.pooex03;

import org.junit.Test;

/**
 *
 * @author Douglas
 */
public class ABCTest {
    
    public ABCTest() {
    }
    
    @Test
    public void test() {
        ABC abc = new ABC();
        
        Imprimir<ABC> imprimir = new Imprimir<>();
        
        imprimir.imprimir(abc);
    }
}
