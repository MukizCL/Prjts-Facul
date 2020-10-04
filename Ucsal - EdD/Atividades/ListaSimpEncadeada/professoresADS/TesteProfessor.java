package professoresADS;
public class TesteProfessor {
	
	public static void main(String[] args) {
		
		ListaProfessor lista = new ListaProfessor();
		Professor p1 = new Professor("João");
		Professor p2 = new Professor("Marcos");
		Professor p3 = new Professor("Fábio");
		Professor p4 = new Professor("Túlio");		
		
		lista.inserirPrimeiro(p1);
		lista.inserirPrimeiro(p2);
		lista.inserirPrimeiro(p3);
		lista.inserirPrimeiro(p4);		
		
		lista.listaProfessores();
		lista.tamanhoAtual();
		
		lista.removerUltimo();
		lista.listaProfessores();
		lista.tamanhoAtual();		

		lista.listaVazia();
		lista.excluirTudo();
		lista.tamanhoAtual();
		lista.listaVazia();
	}
}
