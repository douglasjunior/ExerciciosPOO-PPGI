package br.edu.utfpr.cp.pooex02.util;

import java.util.Random;

/**
 *
 * @author Douglas
 */
public final class Util {

    private static final Random RANDOM = new Random();

    private Util() {
    }

    /**
     * Returna número aleatório de <code>min</code> até <code>max</code> inclusive.
     *
     * @param min
     * @param max
     * @return
     */
    public static int getRandom(int min, int max) {
        int dif = max - min;
        return min + RANDOM.nextInt(dif + 1);
    }
}
