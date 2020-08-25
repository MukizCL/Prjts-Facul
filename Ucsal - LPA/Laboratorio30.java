package br.ucsal;

import java.util.Scanner;

public class Laboratorio30 {

    /* PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10 e razão 6,
     na qual o valor limite da sequencia será informado pelo usuário, obedecendo aos seguintes critérios:
        (1) valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
        (2) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer
        solicitando o valor, até que esteja dentro do intervalo. A sequencia só será construída quando
        o usuário informar o valor dentro do intervalo.
     Com base no texto acima, utilize a estrutura do/while para executar os solucionar abaixo:
        a) Apresente a sequencia;
        b) Calcule a quantidade de elementos da sequencia;
        c) Calcule a média aritmética do primeiro e último valor da sequencia;
        d) Identifique a quantidade de números pares existentes na sequencia;
        e) Identifique a quantidade de números ímpares existentes na sequencia;
        f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia;
        g) Calcule a soma de todos os elementos da sequencia;
        h) Calcule a média ponderada do 13º e do 21º numero da sequencia, considerando os pesos 4 e 6 respectivamente.
            OBS.: Utilize a estrutura de repetição (do/while). */

    public static void main(String[] args) {
        int startvalue = 10, limitvalue, slot = 0, aritmean = 0, evennumbers = 0, oddnumbers = 0, oddnumbersdiv3 = 0;
        int sumall = 0 , firstnumberseqres, firstnumberseq = 13, secondnumberseqres, secondnumberseq = 21 , mean;
        double weightedmean;
        final int COMDIFVALUE = 6, WEIGHT1 = 4, WEIGHT2 = 6;

        firstnumberseqres = (startvalue + ((COMDIFVALUE * firstnumberseq) - COMDIFVALUE)); // Começo da letra h).
        secondnumberseqres = (startvalue + ((COMDIFVALUE * secondnumberseq) - COMDIFVALUE));
        mean = (firstnumberseqres * WEIGHT1) + (secondnumberseqres * WEIGHT2);
        weightedmean = mean / (WEIGHT1 + WEIGHT2);          // Término da letra h).

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer entre 50 e 100.");
        limitvalue = userInput.nextInt();

        do {
            if (limitvalue < 50 || limitvalue > 100) {
                System.out.println("O número informado não se encontra entre 50 e 100. Tente novamente:");
                limitvalue = userInput.nextInt();
            }

        } while (limitvalue < 50 || limitvalue > 100);

        System.out.print("A sequência de números é: ");
        while (startvalue < limitvalue) {                   // Começo da letra a).
            System.out.print(startvalue + " ");
            startvalue += COMDIFVALUE;
            if (startvalue % 2 == 0) {                      // Começo da letra d).
                evennumbers++;                              // Término da letra d)
            } else if (startvalue % 2 != 0) {               // Começo da letra e).
                oddnumbers++;                               // Término da letra e)
                if (startvalue % 3 == 0) {                  // Começo da letra f).
                    oddnumbersdiv3++;                       // Término da letra f)
                }
            }
            sumall += (startvalue - COMDIFVALUE);           // Começo e término da letra g).
            slot++;                                         // Término da letra a) e começo e término da letra b).
            if (slot == 1 || slot == 9) {                   // Começo da letra c).
                aritmean += startvalue;                     // Término da letra c).
            }
        }

        System.out.println("\nO número de elementos na sequência é de: " + slot + ".");
        System.out.println("O valor da média arítmética é de: " + (aritmean/2) + ".");
        System.out.println("O número de elementos pares na sequência é de: " + evennumbers + ".");
        System.out.println("O número de elementos impares na sequência é de: " + oddnumbers + ".");
        System.out.println("O número de elementos impares divido por 3 na sequência é de: " + oddnumbersdiv3 + ".");
        System.out.println("A soma de todos os valores é de: " + sumall + ".");
        System.out.println("A média ponderada do 13º e do 21º numero da sequencia é: " + weightedmean + ".");

    }
}
