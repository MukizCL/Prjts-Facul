package lista.JavaBasico;

public class IgualOuDiferente {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		diferenteOuIgual(a, b);

	}
	
	public static void diferenteOuIgual(int a, int b) {
		if (a == b) {
			System.out.println("Os números são iguais.");
		} else {
			if (a > b) {
				System.out.println(a + " é maior que " + b);
			} else if (b > a) {
				System.out.println(b + " é maior que " + a);
			}
		}
	}

}
