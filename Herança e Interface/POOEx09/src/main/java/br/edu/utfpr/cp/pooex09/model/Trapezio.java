package br.edu.utfpr.cp.pooex09.model;

/**
 *
 * @author Douglas
 */
public class Trapezio extends Retangulo {

    private double base2;

    public Trapezio(double base, double base2, double altura) {
        super(base, altura);
        this.base2 = base2;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    @Override
    public double calculaArea() {
        return 0.5 * (getBase() + getBase2()) * getAltura();
    }
}
