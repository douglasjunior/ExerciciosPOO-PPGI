package br.edu.utfpr.cp.pooex09;

/**
 *
 * @author Douglas
 */
public class Fruta implements Comparable<Fruta> {

    private String nome;

    public Fruta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Compara por ordem alfabética do nome da Fruta.
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Fruta o) {
        return nome.compareTo(o.nome);
    }

}
