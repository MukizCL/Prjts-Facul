package br.ucsal;

public class Questao03 {
	
	public static void main(String[] args) {
		int vInicial = 31, contador = 0, vNum19 = 0, vNum26 = 0, vMedia = 0, vMediaPond = 0;
		final int PESO1 = 4, PESO2 = 5;
		while (contador < 30) {
			if (vInicial % 13 == 5) {
				contador++;
				if (contador == 19) {
					vNum19 = vInicial;
				} else if (contador == 26) {
					vNum26 = vInicial;
				}
			}
			vInicial++;
		}
		vMedia = (vNum19 * PESO1) + (vNum26 * PESO2);
		vMediaPond = vMedia / (PESO1 + PESO2);
		System.out.println(vMediaPond);
	}

}
