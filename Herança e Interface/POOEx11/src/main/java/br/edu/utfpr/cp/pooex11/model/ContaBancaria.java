package br.edu.utfpr.cp.pooex11.model;

/**
 *
 * @author Douglas
 */
public class ContaBancaria {

    private final int numConta;
    private final int digitoVerificador;

    public ContaBancaria(int numConta) {
        this.numConta = numConta;
        this.digitoVerificador = calcularDigito();
    }

    public int getNumConta() {
        return numConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    private int calcularDigito() {
        String numStr = Integer.toString(numConta);
        int soma = 0;
        for (int i = 0; i < numStr.length(); i++) {
            Character c = numStr.charAt(i);
            int indice = i + 1;
            soma += indice * Integer.parseInt(c.toString());
        }
        return soma % 11;
    }

    @Override
    public String toString() {
        return "Conta: " + numConta + " - " + digitoVerificador;
    }
}
