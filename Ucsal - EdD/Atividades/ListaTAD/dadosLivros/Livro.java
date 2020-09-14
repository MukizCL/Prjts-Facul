package dadosLivros;

public class Livro {

	private String nome;
	private String editora;
	private int anoPub;
	
	public void addLivro(String nome, String editora, int anoPub) {
		this.nome = nome;
		this.editora = editora;
		this.anoPub = anoPub;
		
	}

	@Override
	public String toString() {
		return "Nome = " + nome + "\nEditora = " + editora + "\nAno de Publicação = " + anoPub;
	}
}
