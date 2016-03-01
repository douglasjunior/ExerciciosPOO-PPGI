package br.edu.utfpr.cp.pooex02;

import br.edu.utfpr.cp.pooex02.model.Ecossistema;
import br.edu.utfpr.cp.pooex02.model.Rio;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {

        Ecossistema rio = new Rio(20);
        System.out.println(rio);

        for (int i = 0; i < 10; i++) {
            rio.proximoInstante();
            System.out.println(rio);
        }
    }
}
