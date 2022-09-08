package br.senai.sc.livros.model.dao;

import br.senai.sc.livros.model.entities.*;

import java.util.HashSet;
import java.util.Set;

public class PessoaDAO {
    private static Set<Pessoa> listaPessoas = new HashSet<>();

    public void inserir(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public Pessoa selecionarPorEMAIL(String email) {
        for (Pessoa pessoa: listaPessoas) {
            if (pessoa.getEmail().equals(email))
                return pessoa;
        }
        throw new RuntimeException("E-mail não encontrado!");
    }

    static {
        listaPessoas.add(new Autor("KenzoAutor", "Sato", "ka@", "123", Genero.MASCULINO, "123"));
        listaPessoas.add(new Revisor("KenzoRevisor", "Sato", "kr@", "123", Genero.MASCULINO, "123"));
        listaPessoas.add(new Diretor("KenzoDiretor", "Sato", "kd@", "123", Genero.MASCULINO, "123"));
    }
}
