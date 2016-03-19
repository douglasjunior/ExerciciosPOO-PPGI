package br.edu.utfpr.cp.pooex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class PessoaDAO {

    public List<String> isValidoParaInclusao(Pessoa p) {
        List<String> erros = new ArrayList<>();
        if (!isIdadeValida(p)) {
            erros.add("A idade deve estar entre 1 e 200 inclusive.");
        }
        if (!isNomeValido(p)) {
            erros.add("O nome deve ser composto de letras e ter ao menos 2 partes.");
        }
        if (!isEmailsValidos(p)) {
            erros.add("A pessoa deve possuir ao menos um e-mail. Os e-mails devem seguir o formato ___@___.___");
        }
        return erros;
    }

    private boolean isIdadeValida(Pessoa p) {
        return p.getIdade() > 0 && p.getIdade() <= 200;
    }

    private boolean isNomeValido(Pessoa p) {
        if (p.getNome() == null) {
            return false;
        }
        for (char c : p.getNome().toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        if (p.getNome().split(" ").length < 2) {
            return false;
        }
        return true;
    }

    private boolean isEmailsValidos(Pessoa p) {
        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            return false;
        }
        for (Email e : p.getEmails()) {
            if (!isEmailValido(e)) {
                return false;
            }
        }
        return true;
    }

    private boolean isEmailValido(Email e) {
        if (e.getEndereco() == null || e.getEndereco().isEmpty()) {
            return false;
        }
        String[] partes = e.getEndereco().split("@");
        if (partes.length != 2) {
            return false;
        }
        if (partes[0].length() < 2) {
            return false;
        }
        partes = partes[1].split("\\.");
        if (partes.length != 2) {
            return false;
        }
        if (partes[0].length() < 2) {
            return false;
        }
        if (partes[1].length() < 2) {
            return false;
        }
        return true;
    }

}
