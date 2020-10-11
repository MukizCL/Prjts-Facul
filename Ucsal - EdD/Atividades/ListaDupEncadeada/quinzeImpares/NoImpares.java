package quinzeImpares;

public class NoImpares {
	
	private NoImpares proximo;
	private NoImpares anterior;
	private int valor;
	
	public NoImpares(int valor) {		
		this.proximo = null;
		this.anterior = null;
		this.valor = valor;
	}

	public NoImpares getProximo() {
		return proximo;
	}

	public void setProximo(NoImpares proximo) {
		this.proximo = proximo;
	}

	public NoImpares getAnterior() {
		return anterior;
	}

	public void setAnterior(NoImpares anterior) {
		this.anterior = anterior;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}	

}
