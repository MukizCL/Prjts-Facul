package br.ucsal;

import java.util.Scanner;

public class Laboratorio31 {

    /* PROBLEMA: elabore uma sequencia (PG) de razão 5, contendo 10 elementos, cujo valor inicial
     será informado pelo usuário dentro de um intervalo fechado de 50 a 60. O usuário só poderá
     informar errado 03 vezes. Passando desse número o mesmo deve apresentar mensagem de fim
     da execução. Utilize a estrutura "for". */

    public static void main(String[] args) {
        int valor, contar;
        final int RAZAO = 5;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um valor entre 50 e 60:");
        valor = userInput.nextInt();

        for (contar = 1; (valor < 50 || valor > 60) && contar < 3; contar++) { // Ele começa a contar depois que "capta" o 'valor' pela primeira vez. Por isso o 'contar < 2', e não 3.
            System.out.println("Valor errado. O valor deve ser entre 50 e 60. Tente novamente: ");
            valor = userInput.nextInt();
        }
        if (contar <= 3 && valor >= 50 && valor <= 60) {
            for (contar = 1; contar <= 10; contar++, valor *= RAZAO) {
                System.out.println(valor + "");
            }
        } else {
            System.out.println("Máximo número de erros atingido.");
        }
    }
}
