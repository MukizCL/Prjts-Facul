package agendaTelefonica;

public class Agenda {
	
	private int numero;

	public Agenda() {		
		this.numero = 0;
	}

	private int getNumero() {
		return numero;
	}
	
	private int setNumero(int num) {
		this.numero = num;
		return num;		
	}
	
	public void adicionar(int addNum) {
		this.setNumero(addNum);		
	}
	
	public void excluir(int num){
		if (getNumero() == num)
		this.setNumero(0);
	}

	public void atualizar() {
		System.out.println(getNumero());
	}
}
