package br.ucsal;

public class Questao02 {

    public static void main(String[] args) {
    	
    	int x = 5, y = 4;
		obterArray01(x, y);
		int[][] temp1 = obterArray01(x, y);
		imprimir(temp1);

		imprimir("");

		int[][] temp2 = obterArray02(x, y);
		imprimir(temp2);

		imprimir("");

		int[][] temp3 = obterArray03(temp1, temp2);
		imprimir(temp3);

		imprimir("");

		int[] temp4 = obterArray04(temp3);
		imprimir(temp4);
 
    }
 
    public static int[][] obterArray01(int x, int y) {
		int[][] arrayBidiArit = new int[x][y];
		final int RAZAO = 3;
		int valor = 5;

		for (int l = 0; l < arrayBidiArit.length; l++) {
			for (int c = 0; c < arrayBidiArit[l].length; c++) {
				arrayBidiArit[l][c] = valor;

				valor = valor + RAZAO;
			}
		}
		return arrayBidiArit;
	}
    
    public static int[][] obterArray02(int x, int y) {
		int[][] arrayBidiFibo = new int[x][y];
		int vPrimeiro = 0, vSegundo = 1, vAuxiliar;

		for (int l = 0; l < arrayBidiFibo.length; l++) {
			for (int c = 0; c < arrayBidiFibo[l].length; c++) {
				arrayBidiFibo[l][c] = vPrimeiro;

				vAuxiliar = vPrimeiro + vSegundo;  
				vPrimeiro = vSegundo;
				vSegundo = vAuxiliar;				
			}
		}
		return arrayBidiFibo;
	}
    
    public static int[][] obterArray03(int[][] x, int[][] y) {
		int[][] arrayBidiSoma = new int[x.length][x[0].length];

		for (int l = 0; l < arrayBidiSoma.length; l++) {
			for (int c = 0; c < arrayBidiSoma[l].length; c++) {
				arrayBidiSoma[l][c] = x[l][c] * y[l][c];
			}			
		}		
		return arrayBidiSoma;
	}
    
	public static int[] obterArray04(int[][] x) {
		int[] arrayBidiFinal = new int[x.length * x[0].length];

		for (int l = 0, a = 0; l < x.length; l++) {
			for (int c = 0; c < x[l].length; c++, a++) {
				arrayBidiFinal[a] = x[l][c] * 2;
			}

		}		
		return arrayBidiFinal;
	}
	
	public static void imprimir(String txt) {
		System.out.println(txt);
	}

	public static void imprimir(int[][] array) {
		for (int l = 0; l < array.length; l++) {
			for (int c = 0; c < array[l].length; c++) {
				System.out.print(array[l][c] + " ");
			}
		}
	}

	public static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {	
			System.out.print(array[i] + " ");
		}

	}
    
}