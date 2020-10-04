package adicionaFimOuComeço;

public class ListaEncadeadaNumeros {

	private NoNumeros primeiro;
	private NoNumeros ultimo;
	private NoNumeros auxiliar;
	private int qntdNumeros;

	public void adicionarComeco (int n) {
		NoNumeros noNumeros = new NoNumeros();
		noNumeros.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noNumeros;
			this.ultimo = noNumeros;
			this.qntdNumeros++;
			taCheio();
		} else {
			noNumeros.setProximo(this.primeiro);
			this.primeiro = noNumeros;			
			this.qntdNumeros++;
			taCheio();
		}
	}

	public void adicionarFinal (int n) {
		NoNumeros noNumeros = new NoNumeros();
		noNumeros.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noNumeros;
			this.ultimo = noNumeros;
			this.qntdNumeros++;
			taCheio();
		} else {
			this.ultimo.setProximo(noNumeros);
			this.ultimo = noNumeros;
			this.qntdNumeros++;
			taCheio();
		}
	}

	public void taCheio() {
		if (this.qntdNumeros >= 7) {
			System.out.println("A lista está cheia!");
			System.exit(0);
		} else {
			System.out.println("Ainda há " + (7 - this.qntdNumeros) +" espaços na lista.");
		}
	}

}
