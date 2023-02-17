package ExemploSet;
/*
Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episodio);

Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Serie 3 = Nome: that 70's show, genero: comedia, tempoEpisodio: 25
 */

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries =   new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70's Show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 =   new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70's Show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("--\tOrdem natural (Tempo de Episódio)\t--");
        Set<Serie> minhasSeries2 =   new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/Tempo de Episódio\t--");
        Set<Serie> minhasSeries3 =   new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem por Gênero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());


        System.out.println("--\tOrdem por Tempo de Episódio\t--");
}
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}


    class ComparatorGenero implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {

            int genero = s1.getGenero().compareTo(s2.getGenero());

            return genero;
        };
    }
