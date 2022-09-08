package br.senai.sc.livros.model.dao;

import br.senai.sc.livros.model.entities.Editora;

import java.util.ArrayList;

public class EditoraDAO {
    private static ArrayList<Editora> listaEditoras = new ArrayList<>();

    static {
        listaEditoras.add(new Editora("KenzoEditora1"));
        listaEditoras.add(new Editora("KenzoEditora2"));
        listaEditoras.add(new Editora("KenzoEditora3"));
        listaEditoras.add(new Editora("KenzoEditora4"));
        listaEditoras.add(new Editora("KenzoEditora5"));
    }

    public ArrayList<Editora> getListaEditora() {
        return listaEditoras;
    }
}
