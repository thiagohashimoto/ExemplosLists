package ExemploSet;
/*
Crie um conjunto contendo cores do Arco-íris e:
a) Exiba todas as cores uma abaixo da outra
b) A quantidade de cores que o arco-íris tem
c) Exiba as cores em ordem alfabética
d) Exiba as cores na ordem inversa da que foi informada
e) Exiba todas as cores que começam com a letra 'V'
f) Remova todas as cores que não começam com a letra 'V'
g) Limpe o conjunto
h) Confira se o conjunto está vazio
 */

import java.util.*;

public class Ex1_SetDIO {
    public static void main(String[] args) {

        Set<ArcoIris> arcoIris = new LinkedHashSet<>(){{
            add(new ArcoIris("Vermelho"));
            add(new ArcoIris("Laranja"));
            add(new ArcoIris("Amarelo"));
            add(new ArcoIris("Verde"));
            add(new ArcoIris("Azul"));
            add(new ArcoIris("Anil"));
            add(new ArcoIris("Violeta"));
        }};
        int count = 0;
        for(ArcoIris arcoiris : arcoIris){
            count++;
            System.out.println(arcoiris.getCor());
        }

        System.out.println("Quantidade de cores: " + count);

        System.out.println("--\tOrdem Alfabética\t--");
        Set<ArcoIris> arcoIris2 = new TreeSet<>(new ComparatorCor());
            arcoIris2.addAll(arcoIris);
        for(ArcoIris arcoiris : arcoIris2){
            System.out.println(arcoiris.getCor());
        }

        System.out.println("--\tOrdem Inversa\t--");
        Set<String> arcoIris3 = new LinkedHashSet<>(Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(arcoIris3);
        List<String> arcoIrisList3 = new ArrayList<>(arcoIris3);
        Collections.reverse(arcoIrisList3);
        System.out.println(arcoIrisList3);

        System.out.println("--\tExiba todas as cores que começam com a letra ”v” \t--");
        for (String cor : arcoIris3 ){
            if(cor.startsWith("V")) System.out.println(cor);
            }

        System.out.println("--\tRemova todas as cores que não comecam com a letra ”v” \t--");
        arcoIris3.removeIf(s -> s.startsWith("V"));
        System.out.println(arcoIris3);

        System.out.println("--\tLimpe o conjunto\t--");
        arcoIris3.clear();
        System.out.println(arcoIris3);

        System.out.println("--\tConfira se o conjunto está vazio\t--");
        System.out.println(arcoIris3.isEmpty());

        //Estudar sobre iterator

        }
    }


