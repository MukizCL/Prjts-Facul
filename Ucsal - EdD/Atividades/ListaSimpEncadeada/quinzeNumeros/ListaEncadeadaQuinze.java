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
			System.out.println("\nA lista est� cheia!");
		} else if (this.quantNumeros > 15) {
			System.exit(0);
		} else {
			System.out.println("Ainda h� " + (15 - this.quantNumeros) +" espa�os na lista.");
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
				System.out.println("\nO n�mero [" + n + "] n�o est� contido na lista.");
				System.exit(0);
			}			
		}
		
		System.out.println("\nO n�mero [" + posAtual.getValor() + "] est� na posi��o n�mero " + (posNum + 1) + ".");
		
		return mensagem;
	}

}
