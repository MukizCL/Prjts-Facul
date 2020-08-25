package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class Laboratorio45 {

	/** PROBLEMA: Criar o jogo da Mega Sena considerando as seguintes ações:
	 * 
	 * 1) Um método chamado obterArrayCartao para retornar um o array bidimensional que irá representar o cartão. 
	 * 
	 * 2) Imprimir o cartão da Mega Sena:
	 * 01  02  03  04  05  06  07  08  09  10  	 
	 * 11  12  13  14  15  16  17  18  19  20  
	 * 21  22  23  24  25  26  27  28  29  30  
	 * 31  32  33  34  35  36  37  38  39  40  
	 * 41  42  43  44  45  46  47  48  49  50  
	 * 51  52  53  54  55  56  57  58  59  60
	 * 
	 * 3) Um método chamado obterArraySorteado para retornar um array unidimensional com os 06 valores  definidos 
	 * aleatoriamente com o uso do Random  
	 * 
	 * 4) Um método chamada obterArrayInformado para retornar um array unidimensional com os 08 valores informados pelo 
	 * usuário 
	 * 
	 * 5) Após obter os valores dos usuário, imprimir o cartão com os valores informados pelo 
	 * usuário
	 * 
	 * 6) Imprimir o resultado da correção do cartão considerando que se o usuário acertou todos 
	 * os valores sorteados informe "Ganhador da Mega" caso contrário informe os valores que o 
	 * usuário acertou. */
	public static void main(String[] args) {
		int vlr1 = 6, vlr2 = 10;
		int[][] t1 = obterArrayCartao(vlr1, vlr2); // Cartão
		imprimir(t1);
		imprimir("\n\n");
		int[] t2 = obterArraySorteado(); // Valores aleatorios
		imprimir(t2);
		imprimir("\n\n");
		int[] t3 = obterArrayInformado(8); // Valores do usuario
		imprimir(t3);
		imprimir("\n\n");
		imprimir(t1, t3); // Imprimindo cartão do usuario
		imprimir("\n\n");
		imprimir(obterResultado(t3, t2)); // Obtendo resultado final
	}

	/* Objetivo: retornar o resultado do jogo */
	public static String obterResultado(int[] usu, int[] sor) {
		String res = "", str = "";
		int cont = 0;
		for (int i = 0; i < sor.length; i++) { // Percorrer os numeros sorteados
			for (int j = 0; j < usu.length; j++) { // Percorrer os numeos informados pelo usuario
				if(sor[i] == usu[j]) {
					cont++;
					str += " " + sor[i];
				}
			}
		}

		if(cont == 6) {
			res = "Ganhador da Mega";
		} else if (cont == 0) {
			res = "Não acertou nenhum valor";
		} else {
			res = "Acertou: " + str;
		}

		return res;
	}


	/* Objetivo:  retornar um array unidimensional com os 08 valores informados pelo usuário */
	public static int[] obterArrayInformado(int qtde) {
		Scanner sc = new Scanner(System.in);
		int[] inf = new int[qtde];
		imprimir("Informe " + qtde + " valores");
		for (int i = 0, v; i < inf.length; ) {
			v = sc.nextInt();
			if(v >= 1 && v <= 60) {
				//repetição para verificar se o valor já foi inserido.
				inf[i] = v;
				i++;
			} else {
				imprimir("valor fora do intervalo");
			}
		}
		sc.close();
		return inf;
	}

	/* Objetivo: retornar um array unidimensional com os 06 valores definidos aleatoriamente com o uso do Random */
	public static int[] obterArraySorteado() {
		Random rd = new Random();
		int[] ale = new int[6];
		for (int i = 0; i < ale.length; i++) {
			ale[i] = rd.nextInt(60) + 1;
		}
		return ale;
	}

	/* Objetivo:  retornar um o array bidimensional que irá representar o cartão (valores do cartão) */
	public static int[][] obterArrayCartao(int l, int c) {
		int[][] array = new int[l][c];
		for (int i = 0, s = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++, s++) {
				array[i][j] = s;
			}
		}
		return array;
	}



	/* Objetivo: Metodos de impressão */
	public static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void imprimir(String txt) {
		System.out.print(txt);
	}

	// Impressão com zero a esquerda
	public static void imprimir(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] < 10) {
					System.out.print("0");
				} else {
					System.out.print("");
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Impressão do cartão preenchido
	public static void imprimir(int[][] array, int[] vlrs) {
		String fim = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				fim = "";
				for (int k = 0; k < vlrs.length; k++) {
					if(vlrs[k] == array[i][j]) {
						fim = "*";
					} 
				}
				if(array[i][j] < 10) {
					System.out.print("0");
				} else {
					System.out.print("");
				}
				System.out.print(array[i][j] + fim + " ");
			}
			System.out.println();
		}
	}	
}
