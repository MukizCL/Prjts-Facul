package professoresADS;

public class ListaProfessor {
	
	private NoProfessor primeiro;
	private NoProfessor ultimo;
	private int quantidadeNo;
	
	public ListaProfessor() {
		this.primeiro = null;
		this.ultimo = null;
		this.quantidadeNo = 0;
		
	}

	public NoProfessor getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoProfessor primeiro) {
		this.primeiro = primeiro;
	}

	public NoProfessor getUltimo() {
		return ultimo;
	}

	public void setUltimo(NoProfessor ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidadeNo() {
		return quantidadeNo;
	}

	public void setQuantidadeNo(int quantidadeNo) {
		this.quantidadeNo = quantidadeNo;
	}
	
	public void inserirPrimeiro(Professor p) {
		NoProfessor novoNo = new NoProfessor(p);
		
		if(this.estaVazia()) {
			this.ultimo = novoNo;			
		}
		
		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidadeNo++;
	}
	
	public void inserirUltimo(Professor p) {
		NoProfessor novoNo = new NoProfessor(p);
		
		if (this.estaVazia()) {
			this.primeiro = novoNo;
		} else {
			this.ultimo.setProximo(novoNo);
		}

		this.ultimo = novoNo;
		this.quantidadeNo++;
	}
	
	public void removerUltimo() {
		if (this.primeiro.getProximo() != null) {
			NoProfessor novoNo = buscaPenultimoElemento(this.primeiro);
			this.ultimo = novoNo;
			this.quantidadeNo--;
			novoNo.setProximo(null);			
		} else {
			primeiro = ultimo = null;
		}
	}
	
	private NoProfessor buscaPenultimoElemento(NoProfessor novoNo) {
		if(novoNo.getProximo().equals(ultimo)) {
			return novoNo;
		}
		return buscaPenultimoElemento(novoNo.getProximo()); // Usando recursividade para procurar qual é o penútimo.
	}
	
	public boolean estaVazia() {
		return(this.primeiro == null);
	}
	
	public void listaVazia() {
		if (this.primeiro != null && this.ultimo != null) {
			System.out.println("A lista não está vazia.");
		} else {
			System.out.println("A lista está vazia.");
		}
	}
	
	public void tamanhoAtual() {
		System.out.println("O número de professores é: " + this.getQuantidadeNo() + ".");
	}
	
	public void excluirTudo() {
		this.setPrimeiro(null);
		this.setUltimo(null);
		this.quantidadeNo = 0;
	}
	
	public void listaProfessores() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
		} else {
			NoProfessor atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getProf().getProfessorNome());
				atual = atual.getProximo();
			}
		}

	}
	
//	public void remover() {
//		if (this.primeiro.getProximo() != null) {
//			Celula celula = buscaPenultimoElemento(this.primeiro);
//			this.ultimo = celula;
//			celula.setProximo(null);			
//		} else {
//			primeiro = ultimo = null;
//		}
//	}
	
//	private Celula buscaPenultimoElemento(Celula celula) {
//		if(celula.getProximo().equals(ultimo)) {
//			return celula;
//		}
//		return buscaPenultimoElemento(celula.getProximo()); // Usando recursividade para procurar qual é o penútimo.
//	}


}
