package br.ucsal;

public class Laboratorio42 {

	public static void main(String[] args) {
		imprimir(obterArrBid());

	}

	public static String[][] obterArrBid() {
		String[][] arrBidi = new String[3][5];
		arrBidi[0][0] = "| ";
		arrBidi[0][1] = "joao";
		arrBidi[0][2] = " | ";
		arrBidi[0][3] = "maria";
		arrBidi[0][4] = " |";
		arrBidi[1][0] = "| ";
		arrBidi[1][1] = " 4,7";
		arrBidi[1][2] = " | ";
		arrBidi[1][3] = " 6,8 ";
		arrBidi[1][4] = " |";
		arrBidi[2][0] = "| ";
		arrBidi[2][1] = "REPR";
		arrBidi[2][2] = " | ";
		arrBidi[2][3] = "APROV";
		arrBidi[2][4] = " |";


		return arrBidi;

	}

	public static void imprimir(String[][] arrBidi) {
		System.out.println("  -------------");
		for (int l = 0; l < arrBidi.length; l++) {		
			for (int c = 0; c < arrBidi[l].length; c++) {
				System.out.print(arrBidi[l][c]);
			}
			while (l == arrBidi.length);{
				System.out.println("");
			}
		}
		System.out.println("  -------------");
	}
}
