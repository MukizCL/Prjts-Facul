package cincoAlunos;

public class Alunos {
	
	private String alunoNome;
	private int alunoIdade;
	
	public Alunos(String aln, int id) {
		this.alunoIdade = id;
		this.alunoNome = aln;
	}
	
	public String getAlunoNome() {
		return alunoNome;
	}
	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}
	public int getAlunoIdade() {
		return alunoIdade;
	}
	public void setAlunoIdade(int alunoIdade) {
		this.alunoIdade = alunoIdade;
	}	

}
