package org.digitalinnovationone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*

Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).

 */
public class Ex1_ListDIO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double soma = 0.0;

        List<Double> temperaturaSemestral = new ArrayList<>();

        for (int i = 0 ; i < 6 ; i++){
            System.out.print("Insira a temperatura do mês " + (i+1) + ": ");
            double temp = scan.nextDouble();
            temperaturaSemestral.add(temp);
            soma += temp;
        }
        double mediaTemperatura = soma/temperaturaSemestral.size();

        System.out.println("Média semestral: " + mediaTemperatura);

        for (Double temp : temperaturaSemestral) {
            if (temp > mediaTemperatura) {
                int indexpos = temperaturaSemestral.indexOf(temp);
                switch (indexpos) {
                    case 0 -> System.out.println((indexpos + 1) + " - Janeiro: " + temp + "ºC");
                    case 1 -> System.out.println((indexpos + 1) + " - Fevereiro: " + temp + "ºC");
                    case 2 -> System.out.println((indexpos + 1) + " - Março: " + temp + "ºC");
                    case 3 -> System.out.println((indexpos + 1) + " - Abril: " + temp + "ºC");
                    case 4 -> System.out.println((indexpos + 1) + " - Maio: " + temp + "ºC");
                    case 5 -> System.out.println((indexpos + 1) + " - Junho: " + temp + "ºC");
                }
            }
        }



    }
}

