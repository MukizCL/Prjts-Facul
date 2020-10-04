package quinzeNumeros;

public class ListaEncadeadaQuinze {
	
	private NoQuinze primeiro;
	private NoQuinze ultimo;
	private NoQuinze auxiliar;
	private int quantNumeros;
	
	public void adicionarComeco (int n) {
		NoQuinze noQuinze = new NoQuinze();
		noQuinze.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noQuinze;
			this.ultimo = noQuinze;
			this.quantNumeros++;
			taCheio();
		} else {
			noQuinze.setProximo(this.primeiro);
			this.primeiro = noQuinze;			
			this.quantNumeros++;
			taCheio();
		}
	}
	
	public void adicionarFinal (int n) {
		NoQuinze noQuinze = new NoQuinze();
		noQuinze.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noQuinze;
			this.ultimo = noQuinze;
			this.quantNumeros++;
			taCheio();
		} else {
			this.ultimo.setProximo(noQuinze);
			this.ultimo = noQuinze;
			this.quantNumeros++;
			taCheio();
		}
	}
	
	public void taCheio() {
		if (this.quantNumeros == 15) {
			System.out.println("\nA lista está cheia!");
		} else if (this.quantNumeros > 15) {
			System.exit(0);
		} else {
			System.out.println("Ainda há " + (15 - this.quantNumeros) +" espaços na lista.");
		}
	}	

	public String pesquisar(int n) {
		String mensagem = "";
		int posNum = 0;
		
		NoQuinze posAtual = this.primeiro;		
		while ((posAtual != null) && (posAtual.getValor() != n))  {
			posAtual = posAtual.getProximo();
			posNum++;
			
			if (posNum == 15) {
				System.out.println("\nO número [" + n + "] não está contido na lista.");
				System.exit(0);
			}			
		}
		
		System.out.println("\nO número [" + posAtual.getValor() + "] está na posição número " + (posNum + 1) + ".");
		
		return mensagem;
	}

}
