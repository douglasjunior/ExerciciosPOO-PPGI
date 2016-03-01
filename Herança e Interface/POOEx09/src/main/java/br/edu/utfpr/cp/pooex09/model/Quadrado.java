package br.edu.utfpr.cp.pooex09.model;

/**
 *
 * @author Douglas
 */
public class Quadrado extends Retangulo {
    
    public Quadrado(double tamanho) {
        super(tamanho, tamanho);
    }
    
    public double getTamanho() {
        return getBase();
    }
    
    public void setTamanho(double tamanho) {
        super.setAltura(tamanho);
        super.setBase(tamanho);
    }
    
    @Override
    public final void setBase(double base) {
        setTamanho(base);
    }
    
    @Override
    public void setAltura(double altura) {
        setTamanho(altura);
    }
}
