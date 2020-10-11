package exibirInteiros;

public class NoInteiros {
	
	private NoInteiros proximo;
	private NoInteiros anterior;
	private int valor;
	
	public NoInteiros getProximo() {
		return proximo;
	}
	public void setProximo(NoInteiros proximo) {
		this.proximo = proximo;
	}
	public NoInteiros getAnterior() {
		return anterior;
	}
	public void setAnterior(NoInteiros anterior) {
		this.anterior = anterior;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}	
	
}
