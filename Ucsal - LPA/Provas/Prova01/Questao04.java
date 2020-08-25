package br.ucsal;

public class Questao04 {

	public static void main(String[] args) {
		int anoNormal = 365, anoBissexto = 366, nAnoNorm = 0, nAnoBis = 1, anoInicial = 1970, anoFinal = 2019, diasTotal = 0;
		while (anoFinal > anoInicial) {
			anoInicial++;
			if (anoInicial % 4 == 0 && anoInicial % 100 != 0) {
				nAnoBis++;
			} else {
				nAnoNorm++;
			}
		}
		diasTotal = (anoNormal * nAnoNorm) + (anoBissexto * nAnoBis);
		System.out.println(diasTotal);
	}

}
