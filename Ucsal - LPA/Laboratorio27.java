package br.ucsal;

public class Laboratorio27 {

	/* Elabore uma solu��o para imprimir uma seq��ncia de nove (09) valores inteiros positivos,
	 * iniciada pelos n�meros 1 e 2, onde os valores seguintes (posteriores) dever�o ser obtidos
	 * pela multiplica��o dos dois n�meros imediatamente anteriores.
	 * Ao final apresente as seguintes informa��es:
	 	a) A seq��ncia impressa;
	 	b) A m�dia aritm�tica obtida com o 7� e o �ltimo n�mero da seq��ncia;
	 	c) A soma de todos os n�meros da seq��ncia;
	 	d) A soma de todos os n�meros divis�veis por 4. */
	
	public static void main(String[] args) {
		int pValor = 1, sValor = 2, vResultado, slots = 1, mediaArit = 0, somaTudo = 0, somaDiv4 = 0;
		System.out.print("a) A sequ�ncia impressa �: ");
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
		System.out.print("\nb) A m�dia aritm�tica �: " + (mediaArit/2));	
		System.out.print("\nc) A soma de todos os n�meros da seq��ncia �: " + somaTudo);
		System.out.print("\nd) A soma de todos os n�meros divis�veis por 4 �: " + somaDiv4);

		
		
	}

}
