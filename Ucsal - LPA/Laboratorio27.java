package br.ucsal;

public class Laboratorio27 {

	/* Elabore uma solução para imprimir uma seqüência de nove (09) valores inteiros positivos,
	 * iniciada pelos números 1 e 2, onde os valores seguintes (posteriores) deverão ser obtidos
	 * pela multiplicação dos dois números imediatamente anteriores.
	 * Ao final apresente as seguintes informações:
	 	a) A seqüência impressa;
	 	b) A média aritmética obtida com o 7º e o último número da seqüência;
	 	c) A soma de todos os números da seqüência;
	 	d) A soma de todos os números divisíveis por 4. */
	
	public static void main(String[] args) {
		int pValor = 1, sValor = 2, vResultado, slots = 1, mediaArit = 0, somaTudo = 0, somaDiv4 = 0;
		System.out.print("a) A sequência impressa é: ");
		while (slots <= 9) {
			System.out.print(pValor + " ");
			if (slots == 7 || slots == 9) {
				mediaArit += pValor;
			}
			somaTudo += pValor;
			if (pValor % 4 == 0) {
				somaDiv4 += pValor;
			}
			vResultado = pValor * sValor;
			pValor = sValor;
			sValor = vResultado;
			slots++;
		}
		System.out.print("\nb) A média aritmética é: " + (mediaArit/2));	
		System.out.print("\nc) A soma de todos os números da seqüência é: " + somaTudo);
		System.out.print("\nd) A soma de todos os números divisíveis por 4 é: " + somaDiv4);

		
		
	}

}
