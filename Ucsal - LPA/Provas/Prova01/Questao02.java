package br.ucsal;

public class Questao02 {

	public static void main(String[] args) {
		long contador = 0, vInicio = 10;
		long vNum18 = 0, vNum5 = 0, vMedia, vMediaPond = 0;
		final int RAZAO = 3, PESO1 = 7, PESO2 = 3;

		while (contador < 20) {
			vInicio *= RAZAO;
			contador++;
			if (contador == 5) {
				vNum5 = vInicio;
			} else if (contador == 18) {
				vNum18 = vInicio;
			}
			vMedia = (vNum5 * PESO1) + (vNum18 * PESO2);
			vMediaPond = vMedia / (PESO1+PESO2);
			
		}
		System.out.println(vMediaPond);

	}

}
