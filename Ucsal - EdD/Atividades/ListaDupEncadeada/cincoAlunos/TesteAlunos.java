package cincoAlunos;

public class TesteAlunos {

	public static void main(String[] args) {
		
		ListaAlunos lista = new ListaAlunos();		

		Alunos aluno1 = new Alunos("João", 15);
		Alunos aluno2 = new Alunos("Maria", 19);
		Alunos aluno3 = new Alunos("José", 18);
		Alunos aluno4 = new Alunos("Adriana", 18);
		Alunos aluno5 = new Alunos("Kléber", 21);
		
		Alunos aln1 = new Alunos("Frederico", 25);
		Alunos aln2 = new Alunos("Paula", 22);

		lista.adicionar(aluno1);
		lista.adicionar(aluno2);
		lista.adicionar(aluno3);
		lista.adicionar(aluno4);
		lista.adicionar(aluno5);
		
		lista.listaAlunos();	

		lista.adicionarFim(aln1);
		lista.listaAlunos();
		lista.adicionarInicio(aln2);
		lista.listaAlunos();
		
	}

}
