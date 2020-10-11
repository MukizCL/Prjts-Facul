package exibirInteiros;

public class TesteInteiros {

	public static void main(String[] args) {
		ListaInteiros lista = new ListaInteiros();
		
		lista.listar();
		lista.adicionarFim(5);
		lista.adicionarInicio(10);
		lista.adicionarInicio(17);
		lista.adicionarInicio(20);
		lista.listar();
		lista.adicionarFim(2);
		lista.adicionarFim(1);
		lista.listar();

	}

}
