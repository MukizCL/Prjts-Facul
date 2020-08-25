package br.ucsal;

import java.util.Scanner;

public class Laboratorio30 {

    /* PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10 e raz�o 6,
     na qual o valor limite da sequencia ser� informado pelo usu�rio, obedecendo aos seguintes crit�rios:
        (1) valor limite deve ser informado pelo usu�rio em um intervalo fechado de 50 e 100.
        (2) Se o usu�rio informar qualquer valor fora desse intervalo, o algoritmo dever� permanecer
        solicitando o valor, at� que esteja dentro do intervalo. A sequencia s� ser� constru�da quando
        o usu�rio informar o valor dentro do intervalo.
     Com base no texto acima, utilize a estrutura do/while para executar os solucionar abaixo:
        a) Apresente a sequencia;
        b) Calcule a quantidade de elementos da sequencia;
        c) Calcule a m�dia aritm�tica do primeiro e �ltimo valor da sequencia;
        d) Identifique a quantidade de n�meros pares existentes na sequencia;
        e) Identifique a quantidade de n�meros �mpares existentes na sequencia;
        f) Identifique a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia;
        g) Calcule a soma de todos os elementos da sequencia;
        h) Calcule a m�dia ponderada do 13� e do 21� numero da sequencia, considerando os pesos 4 e 6 respectivamente.
            OBS.: Utilize a estrutura de repeti��o (do/while). */

    public static void main(String[] args) {
        int startvalue = 10, limitvalue, slot = 0, aritmean = 0, evennumbers = 0, oddnumbers = 0, oddnumbersdiv3 = 0;
        int sumall = 0 , firstnumberseqres, firstnumberseq = 13, secondnumberseqres, secondnumberseq = 21 , mean;
        double weightedmean;
        final int COMDIFVALUE = 6, WEIGHT1 = 4, WEIGHT2 = 6;

        firstnumberseqres = (startvalue + ((COMDIFVALUE * firstnumberseq) - COMDIFVALUE)); // Come�o da letra h).
        secondnumberseqres = (startvalue + ((COMDIFVALUE * secondnumberseq) - COMDIFVALUE));
        mean = (firstnumberseqres * WEIGHT1) + (secondnumberseqres * WEIGHT2);
        weightedmean = mean / (WEIGHT1 + WEIGHT2);          // T�rmino da letra h).

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro qualquer entre 50 e 100.");
        limitvalue = userInput.nextInt();

        do {
            if (limitvalue < 50 || limitvalue > 100) {
                System.out.println("O n�mero informado n�o se encontra entre 50 e 100. Tente novamente:");
                limitvalue = userInput.nextInt();
            }

        } while (limitvalue < 50 || limitvalue > 100);

        System.out.print("A sequ�ncia de n�meros �: ");
        while (startvalue < limitvalue) {                   // Come�o da letra a).
            System.out.print(startvalue + " ");
            startvalue += COMDIFVALUE;
            if (startvalue % 2 == 0) {                      // Come�o da letra d).
                evennumbers++;                              // T�rmino da letra d)
            } else if (startvalue % 2 != 0) {               // Come�o da letra e).
                oddnumbers++;                               // T�rmino da letra e)
                if (startvalue % 3 == 0) {                  // Come�o da letra f).
                    oddnumbersdiv3++;                       // T�rmino da letra f)
                }
            }
            sumall += (startvalue - COMDIFVALUE);           // Come�o e t�rmino da letra g).
            slot++;                                         // T�rmino da letra a) e come�o e t�rmino da letra b).
            if (slot == 1 || slot == 9) {                   // Come�o da letra c).
                aritmean += startvalue;                     // T�rmino da letra c).
            }
        }

        System.out.println("\nO n�mero de elementos na sequ�ncia � de: " + slot + ".");
        System.out.println("O valor da m�dia ar�tm�tica � de: " + (aritmean/2) + ".");
        System.out.println("O n�mero de elementos pares na sequ�ncia � de: " + evennumbers + ".");
        System.out.println("O n�mero de elementos impares na sequ�ncia � de: " + oddnumbers + ".");
        System.out.println("O n�mero de elementos impares divido por 3 na sequ�ncia � de: " + oddnumbersdiv3 + ".");
        System.out.println("A soma de todos os valores � de: " + sumall + ".");
        System.out.println("A m�dia ponderada do 13� e do 21� numero da sequencia �: " + weightedmean + ".");

    }
}
