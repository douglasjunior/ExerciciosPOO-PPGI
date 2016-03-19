package br.edu.utfpr.cp.pooex02;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Douglas
 */
public class Pessoa {

    private int id;
    private String nome;
    private int idade;

    private Set<Email> emails;

    public Pessoa() {
        emails = new HashSet<>();
    }

    public Pessoa(int id, String nome, int idade) {
        this();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Set<Email> getEmails() {
        return emails;
    }
}
