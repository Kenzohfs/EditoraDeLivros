package br.senai.sc.livros.controller;

import br.senai.sc.livros.model.entities.*;
import br.senai.sc.livros.model.service.EditoraService;

import java.util.ArrayList;

public class EditoraController {
    Editora model;

    public ArrayList<Editora> buscarLista() {
        EditoraService service = new EditoraService();

        return service.getListaEditora();
    }
}
