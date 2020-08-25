package br.ucsal;

import java.util.Scanner;

public class Laboratorio29 {

    /* PROBLEMA: elabore uma solução no qual o usuario informe um valor inteiro, positivo
    dentro de um intervalo fechado de 500 a 1000. Caso o valor informado não esteja dentro
    do intervalo definido, deve-se solicitar que ele informe o valor novamente. Caso contrário,
    o valor informado será impresso e a execução finalizada.
    Utilize a estrutura de repetição (do / while).*/

    public static void main(String[] args) {
        int value;

        Scanner userInput = new Scanner(System.in);


        System.out.println("Por favor, digite um número inteiro positivo.");
        System.out.println("O número deverá estar entre 500 a 1000:");
        value = userInput.nextInt();

        do {
            if (value < 500 || value > 1000) {
                System.out.println("O número não está entre 500 e 1000.");
                System.out.println("O número deverá estar entre 500 a 1000:");
                value = userInput.nextInt();
            }

        } while (value < 500 || value > 1000) ;

        System.out.println("O valor informado pelo usuário é: " + value + ".");
    }

}
