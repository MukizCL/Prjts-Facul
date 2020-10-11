package cincoAlunos;

public class NoAlunos {
	
	private Alunos aln;
	private NoAlunos proximo;
	private NoAlunos anterior;
	
	public NoAlunos (Alunos a) {
		this.aln = a;
		this.proximo = null;
		this.anterior = null;
	}

	public NoAlunos () {
		this.aln = null;
		this.proximo = null;
		this.anterior = null;
	}
	
	public Alunos getAln() {
		return aln;
	}

	public void setAln(Alunos aln) {
		this.aln = aln;
	}

	public NoAlunos getProximo() {
		return proximo;
	}

	public void setProximo(NoAlunos proximo) {
		this.proximo = proximo;
	}

	public NoAlunos getAnterior() {
		return anterior;
	}

	public void setAnterior(NoAlunos anterior) {
		this.anterior = anterior;
	}	

}
