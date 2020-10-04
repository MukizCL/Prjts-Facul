package matriculaADS;

public class NoAluno {
	
	private Aluno aln;
	private NoAluno proximo;
	
	public NoAluno(Aluno a) {
		this.aln = a;
		this.proximo = null;
	}
	
	public Aluno getAluno() {
		return aln;
	}
	public void setAluno(Aluno aln) {
		this.aln = aln;
	}
	public NoAluno getProximo() {
		return proximo;
	}
	public void setProximo(NoAluno proximo) {
		this.proximo = proximo;
	}	
	
}
