package br.edu.utfpr.cp.pooex11;

import br.edu.utfpr.cp.pooex11.model.ContaBancaria;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ContaBancaria conta = new ContaBancaria(num);
        System.out.println(conta);
    }
}
