package map;

/*
    Dadas as seguintes informações sobre meus livros favoritos e seus autores,
    crie um dicionário e ordene este dicionário:
    exibindo (Autor - Nome do Livro);

    Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. Páginas: 256
    Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, Páginas: 408
    Autor = Harari, Yuval Noah - Livro = 21 Lições para o Século 21, Páginas: 432
 */

import java.util.*;

public class ExemmploOrdenacaoMap
{
    public static void main(String[] args)
    {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>()
        {{
            put("Livro 1", new Livro("Uma Breve História do Tempo", "Hawking, Stephen", 256));
            put("Livro 2", new Livro("O Poder do Hábito", "Duhigg, Charles", 408));
            put("Livro 3", new Livro("21 Lições para o Século 21", "Harari, Yuval Noah", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
        {
            System.out.println(livro.getValue().getAutor() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>()
        {{
            put("Livro 1", new Livro("Uma Breve História do Tempo", "Hawking, Stephen", 256));
            put("Livro 2", new Livro("O Poder do Hábito", "Duhigg, Charles", 408));
            put("Livro 3", new Livro("21 Lições para o Século 21", "Harari, Yuval Noah", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
        {
            System.out.println(livro.getValue().getAutor() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética Autores\t--"); //Está na ordem certa pois o Key ey coloquei como numero de Livro;
        Set<Map.Entry<String, Livro>> meuslivros2 = new TreeSet<>(new ComparatorAutorLivro());
        meuslivros2.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meuslivros2)
        {
            System.out.println(livro.getValue().getAutor() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética Nomes dos Livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
        {
            System.out.println(livro.getValue().getAutor() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Número de Páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
        {
            System.out.println(livro.getValue().getAutor() + " - " + livro.getValue().getNumeroPaginas());
        }

    }
}

class Livro
{
    private String nome;
    private String autor;
    private Integer numeroPaginas;

    Livro(String nome, String autor, Integer numeroPaginas)
    {
        this.nome = nome;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome()
    {
        return nome;
    }

    public String getAutor()
    {
        return autor;
    }

    public Integer getNumeroPaginas()
    {
        return numeroPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && autor.equals(livro.autor) && numeroPaginas.equals(livro.numeroPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, autor, numeroPaginas);
    }

    @Override
    public String toString() {
        return "{" +
                "Nome = '" + nome + '\'' +
                ", Autor = '" + autor + '\'' +
                ", Numero de Páginas = " + numeroPaginas +
                '}';
    }
}

class ComparatorAutorLivro implements Comparator<Map.Entry<String, Livro>>
{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>>
{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2)
    {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livro>>
{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2)
    {
        return l1.getValue().getNumeroPaginas().compareTo(l2.getValue().getNumeroPaginas());
    }
}