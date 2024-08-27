import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }


    public void imprimirLivros() {
        if (livros.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public boolean verificarLivroExistente(Livro livro) {
        return livros.contains(livro);
    }


    public Livro obterLivro(Livro livro) {
        int index = livros.indexOf(livro);
        if (index != -1) {
            return livros.get(index);
        }
        return null;
    }

   
    public boolean isListaVazia() {
        return livros.isEmpty();
    }
}

