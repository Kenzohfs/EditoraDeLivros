import br.senai.sc.livros.model.dao.LivrosDAO;
import br.senai.sc.livros.model.entities.Autor;
import br.senai.sc.livros.model.entities.Genero;
import br.senai.sc.livros.model.entities.Livros;
import br.senai.sc.livros.model.entities.Status;

import java.util.Collection;
import java.util.HashSet;

public class Teste {
    public static void main(String[] args) {
        LivrosDAO dao = new LivrosDAO();
        Collection<Livros> livros = new HashSet<>(dao.selecionarTodos());
        Livros livro = new Livros("String titulo", 120, 80, new Autor("String nome", "String sobrenome", "String email", "String cpf", Genero.FEMININO, "String senha"), Status.AGUARDADNDO_EDICAO);
        livros.add(livro);
        teste(livro.getTitulo());
        teste(livro.getIsbn());
        teste(livro.getAutor());
    }

    public static void teste(Object o) {
        System.out.println(o);
    }
}
