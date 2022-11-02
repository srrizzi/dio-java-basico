package setlist;

import java.util.*;

public class ExemploOrdenacaoSet 
{
    /*
     * Dadas as seguintes informações sobre minhas séries favoritas,
     * crie um conjunto e ordene este conjunto exibindo:
     * (Nome - Genero - tempo de episódio);
     * 
     * Série 1 = Nome: Gothan, Genero: SuperHeroi, tempoEpsodio: 60;
     * Série 2 = Nome: Brooklyn Nine-Nine, Genero: Comedia, tempoEpsodio: 25;
     * Série 3 = Nome: Suits, Genero: Advogado, tempoEpsodio: 45;
     */

    public static void main(String[] args) 
    {
        System.out.println("--\t Ordem de Aleatória\t---");
        Set<Serie> minhasSeries = new HashSet<>()
        {{
            add(new Serie("Gothan", "Super Heroi", 60));
            add(new Serie("Brooklyn Nine-Nine", "Comedia", 25));
            add(new Serie("Suits", "Advogado", 45));
        }};
        for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " +
            serie.getGenero() + " - " + serie.getTempoEpsodio());
            

        System.out.println("--\t Ordem de Inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>()
        {{
            add(new Serie("Gothan", "Super Heroi", 60));
            add(new Serie("Brooklyn Nine-Nine", "Comedia", 25));
            add(new Serie("Suits", "Advogado", 45));
        }};
        for(Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " +
            serie.getGenero() + " - " + serie.getTempoEpsodio());
    
        System.out.println("--\t Ordem de Natural (tempoEpsodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " +
            serie.getGenero() + " - " + serie.getTempoEpsodio());

        System.out.println("--\t Ordem Nome/ Gênero/ TempoEpisodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparetorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpsodio());

        //System.out.println("--\t Ordem de Gênero\t---");
    
        //System.out.println("--\t Ordem de Epsódio\t---");

    }
    
}

class Serie implements Comparable <Serie>
{
    private String nome;
    private String genero;
    private Integer tempoEpsodio;

    public Serie(String nome, String genero, Integer tempoEpsodio)
    {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpsodio = tempoEpsodio;
    }

    public String getNome()
    {
        return nome;
    }

    public String getGenero()
    {
        return genero;
    }
    
    public Integer getTempoEpsodio()
    {
        return tempoEpsodio;
    }

    @Override
    public String toString()
    {
        return  "{" +
                "Nome = '" + nome + '\'' +
                ", Genero = '" + genero + '\'' +
                ", tempoEpisodio = " + tempoEpsodio +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpsodio.equals(o);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome, genero, tempoEpsodio);
    }

    @Override
    public int compareTo(Serie serie)
    {
        int tempoEpsodio = Integer.compare(this.getTempoEpsodio(), serie.getTempoEpsodio());
        if(tempoEpsodio != 0) return tempoEpsodio;

        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparetorNomeGeneroTempoEpisodio implements Comparator<Serie>
{
    @Override
    public int compare(Serie s1, Serie s2)
    {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpsodio(), s2.getTempoEpsodio());
    }
}
