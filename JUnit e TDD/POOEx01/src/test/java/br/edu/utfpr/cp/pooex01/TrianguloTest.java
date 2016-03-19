package br.edu.utfpr.cp.pooex01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class TrianguloTest {

    @Test
    public void isoscelesTest() {
        Triangulo t = new Triangulo(5, 5, 7);

        assertEquals(TipoTriangulo.ISOSCELES, t.getTipo());

        t = new Triangulo(7, 5, 5);

        assertEquals(TipoTriangulo.ISOSCELES, t.getTipo());

        t = new Triangulo(5, 7, 5);

        assertEquals(TipoTriangulo.ISOSCELES, t.getTipo());
    }

    @Test
    public void escalenoTest() {
        Triangulo t = new Triangulo(5, 6, 7);

        assertEquals(TipoTriangulo.ESCALENO, t.getTipo());

        t = new Triangulo(7, 6, 5);

        assertEquals(TipoTriangulo.ESCALENO, t.getTipo());

        t = new Triangulo(6, 7, 5);

        assertEquals(TipoTriangulo.ESCALENO, t.getTipo());

        t = new Triangulo(5, 7, 6);

        assertEquals(TipoTriangulo.ESCALENO, t.getTipo());
    }

    @Test
    public void equilateroTest() {
        Triangulo t = new Triangulo(5, 5, 5);

        assertEquals(TipoTriangulo.EQUILATERO, t.getTipo());

        t = new Triangulo(6, 6, 6);

        assertEquals(TipoTriangulo.EQUILATERO, t.getTipo());
    }

    @Test
    public void trianguloValidoTest() {
        Triangulo t = new Triangulo(5, 6, 7);

        assertTrue(t.isValido());

        t = new Triangulo(7, 6, 7);

        assertTrue(t.isValido());

        t = new Triangulo(7, 7, 7);

        assertTrue(t.isValido());
    }

    @Test
    public void trianguloInvalidoTest() {
        Triangulo t = new Triangulo(0, 6, 7);

        assertFalse(t.isValido());

        t = new Triangulo(5, 0, 7);

        assertFalse(t.isValido());

        t = new Triangulo(5, 6, 0);

        assertFalse(t.isValido());

        t = new Triangulo(0, 0, 0);

        assertFalse(t.isValido());

        t = new Triangulo(10, 5, 5);

        assertFalse(t.isValido());

        t = new Triangulo(5, 10, 5);

        assertFalse(t.isValido());

        t = new Triangulo(5, 5, 10);

        assertFalse(t.isValido());
    }
}
