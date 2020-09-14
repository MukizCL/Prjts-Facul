package dadosAlunos;

public class Alunos {
	
	private String nome;
	private int codigo;
	
	public void addAluno(String nome, int codigo) {		
		this.nome = nome;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + "\nCodigo = " + codigo;
	}
	
	
	
	

}
