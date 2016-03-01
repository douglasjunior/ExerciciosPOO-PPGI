package br.edu.utfpr.cp.pooex02.model;

import br.edu.utfpr.cp.pooex02.util.Util;

/**
 *
 * @author Douglas
 */
public class Rio extends Ecossistema {

    private static final int VAZIO = 0;
    private static final int PEIXE = 1;
    private static final int URSO = 2;

    public Rio(int tamanho) {
        Animal[] animais = new Animal[tamanho];
        for (int i = 0; i < animais.length; i++) {
            animais[i] = criarAnimalAleatorio();
        }
        this.animais = animais;
    }

    @Override
    protected void moverAnimal(Animal a, int posAtual, int posNova) {
        System.out.println("Movendo " + a + " de " + posAtual + " para " + posNova);
        Animal vizinho = animais[posNova];
        if (vizinho instanceof AnimalNull) {
            animais[posAtual] = AnimalNull.NULL;
            animais[posNova] = a;
        } else if (a instanceof Peixe) {
            if (vizinho instanceof Peixe) {
                reproduzirAnimal(PEIXE);
            } else {
                eliminarAnimal(a, posAtual);
            }
        } else if (a instanceof Urso) {
            if (vizinho instanceof Peixe) {
                eliminarAnimal(a, posAtual);
            } else {
                reproduzirAnimal(URSO);
            }
        }
    }

    private Animal criarAnimalAleatorio() {
        int tipo = Util.getRandom(0, 2);
        switch (tipo) {
            case PEIXE:
                return new Peixe();
            case URSO:
                return new Urso();
            default:
                return AnimalNull.NULL;
        }
    }

    private void reproduzirAnimal(int tipo) {
        Animal novo;
        if (tipo == PEIXE) {
            novo = new Peixe();
        } else {
            novo = new Urso();
        }
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] == AnimalNull.NULL) {
                animais[i] = novo;
                System.out.println("Criando " + novo + " na posição " + i);
                return;
            }
        }
    }

    private void eliminarAnimal(Animal a, int posAtual) {
        System.out.println("Eliminando " + a + " da posição " + posAtual);
    }

}
