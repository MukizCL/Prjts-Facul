package br.ucsal;

public class Laboratorio21 {

	/* PROBLEMA: Elabore uma solu��o para construir uma sequencia de valores 
	 * inteiros positivos, na qual o primeiro valor � 0 e o �ltimo 50.*/
	
	public static void main(String[] args) {
		int valor = 0;
		
		System.out.println("Valor inicial = " + valor);
		while (valor < 50) {
			valor++;
			System.out.print(valor + " ");
		}

	}

}
