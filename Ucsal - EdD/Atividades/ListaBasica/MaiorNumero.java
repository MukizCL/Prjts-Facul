package lista.JavaBasico;

public class MaiorNumero {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		numeroMaior(a, b);
	}
	
	public static void numeroMaior(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("Os números são iguais.");
		}		
	}
	
}


