package br.edu.utfpr.cp.pooex01;

/**
 *
 * @author Douglas
 */
class Triangulo {

    private int a, b, c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TipoTriangulo getTipo() throws TrianguloInvalidoException {
        if (!isValido()) {
            throw new TrianguloInvalidoException();
        }
        if (a == b && a == c) {
            return TipoTriangulo.EQUILATERO;
        }
        if (a == b || a == c || b == c) {
            return TipoTriangulo.ISOSCELES;
        }
        return TipoTriangulo.ESCALENO;
    }

    public boolean isValido() {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b <= c) {
            return false;
        }
        if (a + c <= b) {
            return false;
        }
        if (b + c <= a) {
            return false;
        }
        return true;
    }

}
