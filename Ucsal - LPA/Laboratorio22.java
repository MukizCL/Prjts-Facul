package br.ucsal;

public class Laboratorio22 {
	
	/* PROBLEMA: elabore uma solução para construir uma sequencia de 
	 * valores inteiros positivos, pares na qual o último valor 
	 * não pode ser maior que 50. (Não entra o zero, Utilize While) */

	public static void main(String[] args) {
		int valor = 0;
		
		System.out.println("Valor inicial = " + valor);
		while (valor < 49) {
			if (valor != 0 && valor % 2 == 0) {
				System.out.print(valor + " ");
			}
			valor++;
		}
	}

}
