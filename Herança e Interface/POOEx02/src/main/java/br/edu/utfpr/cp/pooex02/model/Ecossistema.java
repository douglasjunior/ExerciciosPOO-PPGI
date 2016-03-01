package br.edu.utfpr.cp.pooex02.model;

import br.edu.utfpr.cp.pooex02.util.Util;
import java.util.Random;

/**
 *
 * @author Douglas
 */
public abstract class Ecossistema {

    private static final int MOVER_INICIO = -1;
    private static final int NAO_MOVER = 0;
    private static final int MOVER_FIM = 1;

    protected Animal[] animais;
    private Random random;

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public void proximoInstante() {
        for (int i = 0; i < animais.length; i++) {
            Animal a = animais[i];
            if (a != AnimalNull.NULL) {
                calcularMovimento(a, i);
            }
        }
    }

    private void calcularMovimento(Animal a, int posAtual) {
        int movimento;
        if (posAtual == 0) {
            movimento = Util.getRandom(NAO_MOVER, MOVER_FIM);
        } else if (posAtual == animais.length - 1) {
            movimento = Util.getRandom(MOVER_INICIO, NAO_MOVER);
        } else {
            movimento = Util.getRandom(MOVER_INICIO, MOVER_FIM);
        }
        if (movimento != NAO_MOVER) {
            int posNova = posAtual + movimento;
            moverAnimal(a, posAtual, posNova);
        }
    }

    protected abstract void moverAnimal(Animal a, int posAtual, int posNova);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        for (; i < animais.length - 1; i++) {
            sb.append(animais[i].toString()).append(", ");
        }
        sb.append(animais[i].toString()).append("]");
        return sb.toString();
    }
}
