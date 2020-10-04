package matriculaADS;

public class ListaAluno {

	private NoAluno primeiro;
	private NoAluno ultimo;
	private int quantidade;

	public ListaAluno() {
		this.primeiro = null;
		this.ultimo = null;
		this.quantidade = 0;
	}

	public NoAluno getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoAluno primeiro) {
		this.primeiro = primeiro;
	}

	public NoAluno getUltimo() {
		return ultimo;
	}

	public void setUltimo(NoAluno ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean estaVazia() {
		return(this.primeiro == null);
	}

	public void adicionar(Aluno aln) {
		NoAluno novoNo = new NoAluno(aln);

		if(this.estaVazia()) {
			this.ultimo = novoNo;			
		}

		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidade++;
	}

	public void remover() {
		if (this.primeiro.getProximo() != null) {
			NoAluno novoNo = buscaPenultimoElemento(this.primeiro);
			this.ultimo = novoNo;
			this.quantidade--;
			novoNo.setProximo(null);			
		} else {
			primeiro = ultimo = null;
		}
	}

	private NoAluno buscaPenultimoElemento(NoAluno novoNo) {
		if(novoNo.getProximo().equals(ultimo)) {
			return novoNo;
		}
		return buscaPenultimoElemento(novoNo.getProximo()); // Usando recursividade para procurar qual é o penútimo.
	}

	public String pesquisar (String nome) {
		String mensagem = "";
		NoAluno atual = this.primeiro;

		while((atual != null) && (!atual.getAluno().getAlunoNome().equals(nome))){
			atual = atual.getProximo();
		}	

		return mensagem = "Nome: " + atual.getAluno().getAlunoNome() + "\n"+
				"Matrícula: " + atual.getAluno().getAlunoMatricula() + "\n";

	}

	public void imprimirLista() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
		} else {
			NoAluno atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getAluno().getAlunoNome());
				atual = atual.getProximo();
			}
		}
	}
	
	
}





