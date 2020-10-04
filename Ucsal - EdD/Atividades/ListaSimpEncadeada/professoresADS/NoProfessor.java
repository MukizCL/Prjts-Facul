package professoresADS;

public class NoProfessor {
	
	private Professor prof;
	private NoProfessor proximo;
	
	public NoProfessor(Professor p) {
		this.prof = p;
		this.proximo = null;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public NoProfessor getProximo() {
		return proximo;
	}

	public void setProximo(NoProfessor proximo) {
		this.proximo = proximo;
	}	
	

}
