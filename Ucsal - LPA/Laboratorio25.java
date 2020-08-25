package br.ucsal;

public class Laboratorio25 {

	/* PROBLEMA: elabore uma solução para construir uma sequencia fibonacci (inicia com 0 e 1),
	 * na qual o último valor não pode ser maior que 1000. 
	 * (valores inteiros e positivos, utilize While) 
	 * 
	 * Fibonacci = 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987. */
	
	public static void main(String[] args) {
		int vInicial = 0, vPosterior = 1, vAux;
		int pValor = 0, sValor = 1;
		while (vInicial <= 1000) {
			System.out.print(vInicial + " ");
			vAux = vInicial + vPosterior; // 5 = 2 + 3
			vInicial = vPosterior; // 3
			vPosterior = vAux; // 5
		}
		
	}

}