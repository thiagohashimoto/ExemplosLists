package org.digitalinnovationone;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_ListDIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> questionario = new ArrayList<>();


        System.out.print("Telefonou para a vítima? ");
        String resposta = scan.next();
        questionario.add(resposta);

        System.out.print("Esteve no local do crime? ");
        resposta = scan.next();
        questionario.add(resposta);

        System.out.print("Mora perto da vítima? ");
        resposta = scan.next();
        questionario.add(resposta);

        System.out.print("Devia para a vítima? ");
        resposta = scan.next();
        questionario.add(resposta);

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scan.next();
        questionario.add(resposta);

        int countAnswers = 0; //Contador de respostas

        for (String respostas : questionario ) {
            if(respostas.toLowerCase().contains("s")){
                countAnswers++;
            }
        }

        System.out.println("----------");
        System.out.println("A pessoa é: ");

        switch (countAnswers) {
            case 0 -> System.out.println("--\tInocente\t--");
            case 1 -> System.out.println("--\tInocente\t--");
            case 2 -> System.out.println("--\tSuspeita\t--");
            case 3, 4 -> System.out.println("--\tCúmplice\t--");
            case 5 -> System.out.println("--\tAssassino\t--");
        }
    }
}
