package br.edu.utfpr.cp.pooex02;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class PessoaTest {

    private PessoaDAO dao;

    @Before
    public void setUp() {
        dao = new PessoaDAO();
    }

    @Test
    public void validaIdadeTest() {
        Pessoa p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertTrue(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(2, "João Silva", 0);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(3, "José Maria", 201);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());
    }

    @Test
    public void validaNomeTest() {
        Pessoa p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertTrue(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(2, "DouglasJunior", 26);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(3, "", 26);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(4, null, 26);
        p.getEmails().add(new Email(1, "douglas@mail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());
    }

    @Test
    public void validaEmailTest() {
        Pessoa p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglas@mail.com"));
        p.getEmails().add(new Email(2, "junior@mail.com"));

        assertTrue(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglasmail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglas@mailcom"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglasmailcom"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "d@mail.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglas@m.com"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());

        p = new Pessoa(1, "Douglas Junior", 26);
        p.getEmails().add(new Email(1, "douglas@mail.c"));

        assertFalse(dao.isValidoParaInclusao(p).isEmpty());
    }
}
