package agendaTelefonica;

public class AgendaTeste {

	public static void main(String[] args) {
		Agenda agenda01 = new Agenda();
		
		agenda01.adicionar(15555555);
		agenda01.atualizar();
		
		agenda01.excluir(15555555);
		agenda01.atualizar();
	}

}
