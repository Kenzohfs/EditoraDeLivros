package br.senai.sc.livros.model.service;

import br.senai.sc.livros.model.dao.EditoraDAO;
import br.senai.sc.livros.model.entities.Editora;

import java.util.ArrayList;

public class EditoraService {
    EditoraDAO acesso = new EditoraDAO();

    public ArrayList<Editora> getListaEditora() {
        return acesso.getListaEditora();
    }
}
