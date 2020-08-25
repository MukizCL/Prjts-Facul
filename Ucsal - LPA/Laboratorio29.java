package br.ucsal;

import java.util.Scanner;

public class Laboratorio29 {

    /* PROBLEMA: elabore uma solu��o no qual o usuario informe um valor inteiro, positivo
    dentro de um intervalo fechado de 500 a 1000. Caso o valor informado n�o esteja dentro
    do intervalo definido, deve-se solicitar que ele informe o valor novamente. Caso contr�rio,
    o valor informado ser� impresso e a execu��o finalizada.
    Utilize a estrutura de repeti��o (do / while).*/

    public static void main(String[] args) {
        int value;

        Scanner userInput = new Scanner(System.in);


        System.out.println("Por favor, digite um n�mero inteiro positivo.");
        System.out.println("O n�mero dever� estar entre 500 a 1000:");
        value = userInput.nextInt();

        do {
            if (value < 500 || value > 1000) {
                System.out.println("O n�mero n�o est� entre 500 e 1000.");
                System.out.println("O n�mero dever� estar entre 500 a 1000:");
                value = userInput.nextInt();
            }

        } while (value < 500 || value > 1000) ;

        System.out.println("O valor informado pelo usu�rio �: " + value + ".");
    }

}
