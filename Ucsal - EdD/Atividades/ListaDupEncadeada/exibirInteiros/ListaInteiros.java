package exibirInteiros;

public class ListaInteiros {
	
	private NoInteiros primeiro;
	private NoInteiros ultimo;
	private NoInteiros aux;
	private int qntdNumeros;
	
	public void adicionarInicio(int n) {
		NoInteiros noInteiros = new NoInteiros();
		noInteiros.setValor(n);
		
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noInteiros;
			this.ultimo = noInteiros;
			this.qntdNumeros++;
		} else {
			this.primeiro.setAnterior(noInteiros);
			noInteiros.setProximo(this.primeiro);
			this.primeiro = noInteiros;
			noInteiros.setAnterior(null);
			this.qntdNumeros++;
		}
	}
	
	public void adicionarFim(int n) {
		NoInteiros noInteiros = new NoInteiros();
		noInteiros.setValor(n);
		
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noInteiros;
			this.ultimo = noInteiros;
			this.qntdNumeros++;
		} else {
			this.ultimo.setProximo(noInteiros);			
			this.ultimo = noInteiros;
			noInteiros.setProximo(null);
			this.qntdNumeros++;
		}		
	}
	
	public void listar() {		
		if (this.qntdNumeros == 0) {
			System.out.println("A lista está vazia!");
		} else {
			NoInteiros atual = this.primeiro;
			while (atual != null) {
				System.out.println(atual.getValor());
				atual = atual.getProximo();
			}
		}		
	}

	@Override
	public String toString() {
		return "ListaInteiros [primeiro=" + primeiro + ", ultimo=" + ultimo + ", aux=" + aux + ", qntdNumeros="
				+ qntdNumeros + "]";
	}
	
	

}
