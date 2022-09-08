package br.senai.sc.livros.model.service;

import br.senai.sc.livros.model.dao.LivrosDAO;
import br.senai.sc.livros.model.entities.Livros;
import br.senai.sc.livros.model.entities.Pessoa;
import br.senai.sc.livros.model.entities.Status;

import java.util.ArrayList;
import java.util.Collection;

public class LivrosService {
    LivrosDAO acesso = new LivrosDAO();

    public void inserir(Livros livro) {
        acesso.inserir(livro);
    }

    public Collection<Livros> selecionarTodos() { return acesso.selecionarTodos(); }

    public Livros selecionar(int isbn) {
        return acesso.selecionar(isbn);
    }

    public void atualizar(int isbn, Livros livroAtualizado) {
        acesso.atualizar(isbn, livroAtualizado);
    }

    public Collection<Livros> selecionarPorAutor(Pessoa pessoa) {
        return acesso.selecionarPorAutor(pessoa);
    }

    public Collection<Livros> selecionarAtividadesAutor(Pessoa pessoa) {
        return acesso.selecionarAtividadesAutor(pessoa);
    }

    public Collection<Livros> selecionarPorStatus(Status status) {
        return acesso.selecionarPorStatus(status);
    }
}
