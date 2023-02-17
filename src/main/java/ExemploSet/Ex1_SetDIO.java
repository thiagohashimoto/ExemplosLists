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

import java.util.HashSet;
import java.util.Set;

public class Ex1_SetDIO {
    public static void main(String[] args) {

        Set<ArcoIris> arcoIris = new HashSet<>(){{
            add(new ArcoIris("Vermelho"));
            add(new ArcoIris("Laranja"));
            add(new ArcoIris("Amarelo"));
            add(new ArcoIris("Verde"));
            add(new ArcoIris("Azul"));
            add(new ArcoIris("Anil"));
            add(new ArcoIris("Violeta"));
        }};

        for(ArcoIris arcoiris : arcoIris){
            System.out.println(arcoiris.getCor());
        }



    }
}

