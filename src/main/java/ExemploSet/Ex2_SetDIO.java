package ExemploSet;
/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriação e ide.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene este conjunto por:
a) Ordem de Inserção
b) Ordem Natural
c) IDE
d) Ano de criação e nome
e) Nome, ano de criação e IDE
 */

import java.util.*;

public class Ex2_SetDIO {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
            minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
            minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        System.out.println("--\tOrdem de Inserção\t--");

        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
            Arrays.asList(
                    new LinguagemFavorita("Python", 1991, "Pycharm"),
                    new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                    new LinguagemFavorita("Java", 1991, "Visual Studio Code")
                    )
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas)
            System.out.println(linguagem);

        System.out.println("--\tOrdem Natural\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(new Comparator<LinguagemFavorita>() {
            @Override
            public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
                return CharSequence.compare(o1.getNome(),o2.getNome());
            }
        });
            minhasLinguagensFavoritas2.addAll(minhasLinguagensFavoritas);
            for (LinguagemFavorita linguagem1 : minhasLinguagensFavoritas2)
                System.out.println(linguagem1);

        System.out.println("--\tOrdem por IDE\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem2 : minhasLinguagensFavoritas3)
            System.out.println(linguagem2);

        System.out.println("--\tOrdem por Ano de Criação e Nome\t--");

    }
}

class LinguagemFavorita{
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + ide + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2) {
        return f1.ide.compareToIgnoreCase(f2.ide);
    }
}

