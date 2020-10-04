package matriculaADS;

public class TesteAluno {

	public static void main(String[] args) {
		
		ListaAluno lista = new ListaAluno();
		Aluno aln1 = new Aluno("Carlos", 151515);
		Aluno aln2 = new Aluno("João", 171819);
		
		lista.adicionar(aln1);
		lista.imprimirLista();
		
		lista.adicionar(aln2);
		lista.imprimirLista();
		
		lista.remover();
		lista.imprimirLista();

	}

}
