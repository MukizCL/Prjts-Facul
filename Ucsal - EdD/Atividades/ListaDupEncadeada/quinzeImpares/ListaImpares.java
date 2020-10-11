package quinzeImpares;

import exibirInteiros.NoInteiros;

public class ListaImpares {

	private NoImpares primeiro;
	private NoImpares ultimo;
	private NoImpares aux;
	private int qntdNumeros;

	public void adicionarInicio(int n) {
		NoImpares noImpares = new NoImpares(n);	

		if (this.qntdNumeros > 16) {
			System.exit(0);
		}

		if (n % 2 == 1) {
			if (this.primeiro == null && this.ultimo == null) {
				this.primeiro = noImpares;
				this.ultimo = noImpares;
				this.qntdNumeros++;
			} else {
				this.primeiro.setAnterior(noImpares);
				noImpares.setProximo(this.primeiro);
				this.primeiro = noImpares;
				noImpares.setAnterior(null);
				this.qntdNumeros++;
			}
		} else {
			System.out.println("O número não é impar.");
		}
	}

	public void adicionarFim(int n) {
		NoImpares noImpares = new NoImpares(n);	

		if (this.qntdNumeros > 16) {
			System.exit(0);
		}

		if (n % 2 == 1) {
			if (this.primeiro == null && this.ultimo == null) {
				this.primeiro = noImpares;
				this.ultimo = noImpares;
				this.qntdNumeros++;
			} else {
				noImpares.setProximo(null);
				this.ultimo.setProximo(noImpares);
				noImpares.setAnterior(this.ultimo);
				this.ultimo = noImpares;				
				this.qntdNumeros++;
			}	
		} else {
			System.out.println("O número não é impar.");
		}

	}

	public void removerInicio() {
		if (this.primeiro == null && this.ultimo == null) {
			System.out.println("A lista já se encontra vazia.");
		} else {
			this.primeiro = this.primeiro.getProximo();
			this.primeiro.setAnterior(null);
			this.qntdNumeros--;
		}
	}

	public void removerFim() {		
		if (this.primeiro == null && this.ultimo == null) {
			System.out.println("A lista já se encontra vazia.");
		} else {			
			this.ultimo = this.ultimo.getAnterior();
			this.ultimo.setProximo(null);
			this.qntdNumeros--;
		}
	}

	public void listarLista() {
		if (this.qntdNumeros == 0) {
			System.out.println("A lista está vazia!");
		} else {
			NoImpares atual = this.primeiro;
			while (atual != null) {
				System.out.println(atual.getValor());
				atual = atual.getProximo();
			}
		}
		
		if (this.qntdNumeros < 15) {
			if (this.qntdNumeros == 14) {
				System.out.println("\nAinda falta [" + (15 - this.qntdNumeros) + "] número restante.");
			} else {
				System.out.println("\nAinda faltam [" + (15 - this.qntdNumeros) + "] números restantes.");
			}
		}
		
		System.out.println("-----");
	}



}
