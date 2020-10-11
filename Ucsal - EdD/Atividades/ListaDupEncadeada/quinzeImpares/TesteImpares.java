package quinzeImpares;

public class TesteImpares {

	public static void main(String[] args) {

		ListaImpares lista = new ListaImpares();

		lista.adicionarFim(11);
		lista.adicionarFim(13);
		lista.adicionarFim(15);
		lista.adicionarFim(17);
		lista.adicionarFim(19);
		lista.adicionarFim(21);
		lista.adicionarFim(23);
		lista.adicionarFim(25);
		lista.adicionarFim(27);
		lista.adicionarFim(29);
		lista.adicionarInicio(9);
		lista.adicionarInicio(7);
		lista.adicionarInicio(5);
		lista.adicionarInicio(3);
		lista.adicionarInicio(1);
		lista.listarLista();	

		lista.removerFim();
		lista.listarLista();
		
		lista.removerInicio();
		lista.listarLista();

	}

}
