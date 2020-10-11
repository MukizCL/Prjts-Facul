package cincoAlunos;

import professoresADS.NoProfessor;

public class ListaAlunos {

	private NoAlunos primeiro;
	private NoAlunos ultimo;
	private int contador;
	private int contadorInicio;
	private int contadorFim;

	public NoAlunos getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(NoAlunos primeiro) {
		this.primeiro = primeiro;
	}
	public NoAlunos getUltimo() {
		return ultimo;
	}
	public void setUltimo(NoAlunos ultimo) {
		this.ultimo = ultimo;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}

	public void estaVazia() {
		if (this.primeiro == null) {
			System.out.println("A lista está vazia.");
		} else {
			System.out.println("A lista possui elementos.");
		}
	}

	public void adicionar(Alunos aln) {
		NoAlunos noAlunos = new NoAlunos(aln);

		if (contador >= 5) {
			System.exit(0);
		} else {
			if (this.primeiro == null && this.ultimo == null) {
				this.primeiro = noAlunos;
				this.ultimo = noAlunos;
				contador++;
			} else {
				this.primeiro.setAnterior(noAlunos);
				noAlunos.setProximo(this.primeiro);
				this.primeiro = noAlunos;
				noAlunos.setAnterior(null);
				contador++;			
			}
		}
	}

	public void adicionarInicio(Alunos aln) {
		NoAlunos noAlunos = new NoAlunos(aln);

		if (contadorInicio > 0) {
			System.exit(0);
		}

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noAlunos;
			this.ultimo = noAlunos;
			contador++;
		} else {
			this.primeiro.setAnterior(noAlunos);
			noAlunos.setProximo(this.primeiro);
			this.primeiro = noAlunos;
			noAlunos.setAnterior(null);
			contador++;
			contadorInicio++;
		}		
	}

	public void adicionarFim(Alunos aln) {
		NoAlunos noAlunos = new NoAlunos(aln);	

		if (contadorFim > 0) {
			System.exit(0);
		}

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = noAlunos;
			this.ultimo = noAlunos;
			contador++;
		} else {
			this.ultimo.setProximo(noAlunos);
			noAlunos.setAnterior(this.ultimo);
			this.ultimo = noAlunos;
			contador++;
			contadorFim++;
		}
	}

	public void listaAlunos() {
		System.out.println("");
		if (contador == 0) {
			System.out.println("A lista está vazia.");
		} else {
			NoAlunos atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getAln().getAlunoNome() + " - " + atual.getAln().getAlunoIdade());
				atual = atual.getProximo();
			}
		}
		
		System.out.println("\n----------------------");
	}

}
