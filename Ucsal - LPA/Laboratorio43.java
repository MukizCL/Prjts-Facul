package br.ucsal;

/* PROBLEMA 01: Preencher um array bidimensional 5 x 6 com a sequencia fibonacci (inicio 0, 1). 
 * PROBLEMA 02: Transportar os valores do array bidimencional para um array unidimencional.
 **/ 

public class Laboratorio43 {

	public static void main(String[] args) {
		int[][] temporario = fibonacci();
		imprimir(temporario);
		imprimir("\n\n");
		imprimir(obterArrayUni(temporario));
	}

	public static int[] obterArrayUni(int[][] array) {
		int[] arrayUni = new int[array.length * array[0].length];
		for (int i = 0, h = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++, h++) {
				arrayUni[h] = array[i][j];
			}

		}
		return arrayUni;
	}

	public static int[][] fibonacci() {
		int vInicial = 0, vPosterior = 1, vAux;	
		int[][] fibo = new int[5][6];

		for (int l = 0; l < fibo.length; l++) {
			for (int c = 0; c < fibo[l].length; c++) {
				vAux = vInicial + vPosterior;
				vInicial = vPosterior;
				vPosterior = vAux;
				fibo[l][c] = vInicial;
			}
		}
		return fibo;
	}

	public static String preencherComZero(int valor) {
		String res = "";
		int max = 6, elementos = (valor + "").length();
		max -= elementos;
		for (int i = 0; i < max; i++) {
			res += "0";
		}
		res += valor;
		return res;
	}

	public static void imprimir(int[][] fibo) {
		System.out.println(" _____________________________________________________");
		for (int l = 0; l < fibo.length; l++) {			
			System.out.print("|");							
			for (int c = 0; c < fibo[l].length; c++) {	
				System.out.print(" " + preencherComZero(fibo[l][c]) + " |");
			}
			System.out.println();
		}
		System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

	}

	public static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {	
			System.out.print(array[i] + " ");
		}

	}

	public static void imprimir (String txt) {
		System.out.println(txt);
	}
}