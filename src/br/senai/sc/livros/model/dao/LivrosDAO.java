package br.senai.sc.livros.model.dao;

import br.senai.sc.livros.model.entities.*;

import java.util.*;

public class LivrosDAO {
    private static Collection<Livros> listaLivros = new HashSet<>();

    static {
        listaLivros.add(new Livros("KenzoLivro 1", 1, 300, new Autor("KenzoAutor 1", "Sato", "autor1@", "123", Genero.MASCULINO, "123"), Status.APROVADO));
        listaLivros.add(new Livros("KenzoLivro 2", 2, 350, new Autor("KenzoAutor 2", "Sato", "autor2@", "123", Genero.MASCULINO, "123"), Status.REPROVADO));
        listaLivros.add(new Livros("KenzoLivro 3", 3, 400, new Autor("KenzoAutor 3", "Sato", "autor3@", "123", Genero.MASCULINO, "123"), Status.AGUARDANDO_REVISAO));
        listaLivros.add(new Livros("KenzoLivro 4", 4, 450, new Autor("KenzoAutor 4", "Sato", "autor4@", "123", Genero.MASCULINO, "123"), Status.AGUARDADNDO_EDICAO));
        listaLivros.add(new Livros("KenzoLivro 5", 5, 500, new Autor("KenzoAutor 5", "Sato", "autor5@", "123", Genero.MASCULINO, "123"), Status.EM_REVISAO));
        listaLivros.add(new Livros("KenzoLivro 6", 6, 550, new Autor("KenzoAutor 6", "Sato", "autor6@", "123", Genero.MASCULINO, "123"), Status.PUBLICADO));
    }

    public void inserir(Livros livro) {
        listaLivros.add(livro);
    }

    public Collection<Livros> selecionarTodos() {
        return Collections.unmodifiableCollection(listaLivros);
    }

    public Collection<Livros> selecionarPorAutor(Pessoa pessoa) {
        List<Livros> lista = new ArrayList<>(listaLivros);
        ArrayList<Livros> livrosAutor = new ArrayList<>();
        for (int i = 0; i < listaLivros.size(); i++) {
            if (lista.get(i).getAutor().equals(pessoa))
                livrosAutor.add(lista.get(i));
        }
        return livrosAutor;
    }

    public Collection<Livros> selecionarAtividadesAutor(Pessoa pessoa) {
        ArrayList<Livros> livrosAutor = new ArrayList<>();
        for (Livros livro : listaLivros) {
            if (livro.getAutor().equals(pessoa) && livro.getStatus().equals(Status.AGUARDADNDO_EDICAO))
                livrosAutor.add(livro);
        }
        return livrosAutor;
    }

    public Collection<Livros> selecionarPorStatus(Status status) {
        List<Livros> lista = new ArrayList<>(listaLivros);
        ArrayList<Livros> livrosStatus = new ArrayList<>();
        for (int i = 0; i < listaLivros.size(); i++) {
            if (lista.get(i).getStatus().equals(status))
                livrosStatus.add(lista.get(i));
        }
        return livrosStatus;
    }

    public Livros selecionar(int isbn) {
        for (Livros livro: listaLivros) {
            if (livro.getIsbn() == isbn)
                return livro;
        }
        throw new RuntimeException();
    }

    public void atualizar(int isbn, Livros livroAtualizado) {
        for (Livros livro : listaLivros) {
            if (livro.getIsbn() == isbn) {
                listaLivros.remove(livro);
                listaLivros.add(livroAtualizado);
            }
        }
    }
}
