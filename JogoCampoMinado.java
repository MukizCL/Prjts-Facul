package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class JogoCampoMinado {

	public static int colunasCM = 11;
	public static int linhasCM = 11;
	public static String[][] tabCampoMinado = new String[linhasCM][colunasCM];
	public static String[][] tabOcultoCampoMinado = new String[linhasCM][colunasCM];


	public static void main(String[] args) {

		jogo();

	}

	public static void jogo() {

		introducaoCM(); 											// Mostra a introdu��o, falando sobre as regras e tals;
		tabuleiroCM(); 												// Imprime o tabuleiro, pois na regra menciona o tamanho e queria ter uma representa��o visual disso;
		aguardeTextoCM();											// Texto 'filler'.
		bombasPosicao();											// Ativa as posi��es das bombas no tabuleiro;
		imprimirTabuleiroCM();
		System.out.println("\nTabuleiro pronto!");
		tabuleiroOcultoCM();										// Oculta o tabuleiro;
		tentativasCM();												// Come�am as tentativas para ganhar o jogo;
		System.out.println("Fim de jogo.");
	}	

	public static void introducaoCM() {								// Mostra a introdu��o, falando sobre as regras e tals;
		System.out.println("\n________________________________________________________________");
		System.out.println("\n[ C A M P O   M I N A D O ]");
		System.out.println("\nBem vindo ao jogo 'Campo-Minado'!");
		System.out.println("As regras desse jogo s�o bem simples:");
		System.out.println("- Voc� jogar� num tabuleiro igual o mostrado abaixo (10 x 10);");
		System.out.println("- Voc� deve acertar todos os 90 quadrados vazios sem atingir nenhuma das 10 minas;");
		System.out.println("- Se voc� chegar em 90 pontos, voc� ganha o jogo.");
		System.out.println("\nBoa sorte!");
		System.out.println("________________________________________________________________");
	}

	public static void aguardeTextoCM() {							// Texto 'filler'.
		System.out.println("________________________________________________________________");
		System.out.println("\nTabuleiro sendo preparado.");
		System.out.println("\nAguarde.");
		System.out.println("\nAguarde..");
		System.out.println("\nAguarde...");
		System.out.println("________________________________________________________________");
	}

	public static void tabuleiroCM() {																				// Tabuleiro do jogo
		System.out.println("");																						// Esse m�todo literalmente s� serve para criar o tabuleiro...;
		for (int x = 0; x < (tabCampoMinado.length - 1); x++) {															// ... corretamente, aplicando um s�mbolo qualquer (nesse caso um "L", de 'livre de mina');
			if (x == 0) {																							// Ele OBRIGATORIAMENTE precisa ser usado l� no m�todo 'jogo()' NAQUELA ORDEM, pois sem ele o...
				System.out.println("-------------------------------------------------------------------");			// ... o pr�ximo m�todo n�o ser� impresso corretamente;
				System.out.println("| ### | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | [10] |");
				System.out.println("-------------------------------------------------------------------");
			}
			for (int y = 0; y < tabCampoMinado[x].length; y++) {
				if (y == 0) {
					if (x < 9) {
						System.out.print("| [" + (x+1) + "] ");
					} else if (x >= 9) {
						System.out.print("|[" + (x+1) + "] ");
					}
				} else {
					tabCampoMinado[x][y] = "L";																		// Esse s�mbolo pode ser mudado para o que quiser, contando que s� ocupe 1 espa�o;
					System.out.print("|  " + tabCampoMinado[x][y] + "  ");
					if (y == 10) {
						System.out.print("|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

	}

	public static void bombasPosicao() {
		Random rand = new Random();
		for (int i = 0; i <= 10; ) {
			int x = rand.nextInt(10);
			int y = rand.nextInt(10);
			
			if (tabCampoMinado[x][y] != "B") {
				if (x >= 0 && x <= 11 && y >= 0 && y <= 11) {
					tabCampoMinado[x][y] = "B";
					i++;
				}
			}
		}
	}	

	public static void imprimirTabuleiroCM() {																		// "Habilite" esse m�todo no 'jogo()', ap�s o 'bombasPosicao()' para ver onde as minas est�o;
		System.out.println("");
		for (int x = 0; x < (tabCampoMinado.length - 1); x++) {
			if (x == 0) {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("| ### | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | [10] |");
				System.out.println("-------------------------------------------------------------------");
			}
			for (int y = 0; y < tabCampoMinado[x].length; y++) {
				if (y == 0) {
					if (x < 9) {
						System.out.print("| [" + (x + 1) + "] ");
					} else if (x >= 9) {
						System.out.print("|[" + (x + 1) + "] ");
					}
				} else {
					System.out.print("|  " + tabCampoMinado[x][y] + "  ");
					if (y == 10) {
						System.out.print("|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

	}

	public static void tentativasCM() {																				// Come�am as tentativas para ganhar o jogo;																													
		Scanner userInput = new Scanner (System.in);

		for (int contadorPontosMaximos = 0; contadorPontosMaximos < 100; ) {														// Loop 'for' para continuar o jogo at� vencer.
			int x, y;																												// O valor do loop no meio do ';  ;' n�o importa muito...
			// ... contanto que seja maior que a condi��o de vit�ria;
			do {
				System.out.print("\nPor favor, escolha uma COLUNA (n�mero entre 1 e 10): ");										// Loop 'do/while' para que, se o n�mero n�o estiver entre 1 e 10
				x = userInput.nextInt();																							// ... o loop come�a denovo;

				if (x < 1 || x > 10) {
					System.out.println("\n[ERRO] N�mero fora dos par�metros pedidos, tente novamente.");
				}
			} while (x < 1 || x > 10);

			do {																													// Mesma coisa aqui, s� que com o 'y';
				System.out.print("Por favor, escolha uma LINHA (n�mero entre 1 e 10): ");
				y = userInput.nextInt();

				if (y < 1 || y > 10) {
					System.out.println("\n[ERRO] N�mero fora dos par�metros pedidos, tente novamente.");
				}
			} while (y < 1 || y > 10);

			if (y == 1 && x == 10) {																								// Come�am as condi��es ( VEJAM ESSAS IMAGENS NO LINK: https://imgur.com/a/zaIMGih )
				if (tabCampoMinado[(x - 1)][y].equals("B")) {																		// CONDI��O 1;
					System.out.println("Tem uma mina perto dessa posi��o.");														// Quando 'y == 1' e 'x == 10', n�o posso vasculhar o...
				} else if (tabCampoMinado[x][(y + 1)].equals("B")) {																// '[y - 1]' e '[x + 1]', pois est�o fora do Array; 
					System.out.println("Tem uma mina perto dessa posi��o.");
				}
			} else if (x == 1 && y == 10) {																							// CONDI��O 2;
				if (tabCampoMinado[(x + 1)][y].equals("B")) {																		// Quando 'x == 1' e 'u == 10', n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[x - 1]' e '[y + 1]', pois est�o fora do Array;
				} else if (tabCampoMinado[x][(y - 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");														// >>> LEMBRANDO QUE AS POSI��ES [n][0] E [0][n] EST�O SENDO USADAS PARA MARCAR OS N�MEROS DE APOIO DO TABULEIRO;
				}
			} else if (x == 10 && y == 10) {																						// CONDI��O 3;
				if (tabCampoMinado[(x - 1)][y].equals("B")) {																		// Quando 'x == 10' e 'y == 10, n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[x + 1]' e '[y + 1]', pois est�o fora do Array;
				} else if (tabCampoMinado[x][(y - 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}
			} else if (x == 1 && y == 1) {																							// CONDI��O 4;
				if (tabCampoMinado[(x + 1)][y].equals("B")) {																		// Quando 'x == 1' e 'y == 1, n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[x - 1]' e '[y - 1]', pois est�o fora do Array;
				} else if (tabCampoMinado[x][(y + 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}
			} else if (x != 10 && y == 1) {																							// CONDI��O 5;
				if (tabCampoMinado[(x + 1)][y].equals("B")) {																		// Quando 'x != 10' e 'y == 1, n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[y - 1]', pois est� fora do Array;
				} else if (tabCampoMinado[(x - 1)][y].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				} else if (tabCampoMinado[x][(y + 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}
			} else if (x == 10 && y != 1) {																							// CONDI��O 6;
				if (tabCampoMinado[(x - 1)][y].equals("B")) {																		// Quando 'x == 10' e 'y != 1, n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[x + 1]', pois est� fora do Array;
				} else if (tabCampoMinado[x][(y + 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				} else if (tabCampoMinado[x][(y - 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}
			} else if (x != 1 && y == 10) {																							// CONDI��O 7;
				if (tabCampoMinado[(x + 1)][y].equals("B")) {																		// Quando 'x != 1' e 'y == 10, n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[y + 1]', pois est� fora do Array;
				} else if (tabCampoMinado[(x - 1)][y].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				} else if (tabCampoMinado[x][(y - 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}
			} else if (x == 1 && y != 10) {																							// CONDI��O 8;
				if (tabCampoMinado[(x + 1)][y].equals("B")) {																		// Quando 'x == 1' e 'y != 10, n�o posso vasculhar o...
					System.out.println("\nTem uma mina perto dessa posi��o.");														// '[x - 1]', pois est� fora do Array;
				} else if (tabCampoMinado[x][(y + 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				} else if (tabCampoMinado[x][(y - 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}				
			} else {
				if (tabCampoMinado[(x + 1)][y].equals("B")) {																		// CONDI��O PADR�O;
					System.out.println("\nTem uma mina perto dessa posi��o.");														// Condi��o de pesquisa para todas as coodernadas...
				} else if (tabCampoMinado[(x - 1)][y].equals("B")) {																// Que n�o est�o acima (do [2][2] at� [9][9]);
					System.out.println("\nTem uma mina perto dessa posi��o.");
				} else if (tabCampoMinado[x][(y + 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				} else if (tabCampoMinado[x][(y - 1)].equals("B")) {
					System.out.println("\nTem uma mina perto dessa posi��o.");
				}
			}

			if (tabCampoMinado[x][y].equals("L")) {																					// Se, a posi��o no tabuleiro normal possui um "L" (de livre de mina)...
				if (tabOcultoCampoMinado[x][y] != ("@")) {																			// Ele vai ver se aquela posi��o J� N�O FOI MUDADA no tabuleiro oculto e...
					contadorPontosMaximos++;																						// Vai adicionar um ponto no 'contadorPontosMaximos'.
				}
				tabOcultoCampoMinado[x][y] = "@";																					// Al�m disso, vai colocar um "@" na coordenada escolhida no tabuleiro oculto;
				System.out.println("\nEspa�os livres descobertos: " + contadorPontosMaximos + " de 90.");							// Guia para ajudar a ver quantos pontos j� foram feitos;
				imprimirTabuleiroOcultoCM();																						// Impress�o do mapa, j� atualizado com a jogada que foi feita.

			} else if (tabCampoMinado[x][y].equals("B")) {																			// Se o jogador achar uma mina ("B")...
				System.out.println("\nQue pena! Voc� acertou uma mina!");		
				System.out.println("\n");
				return;																												// ... volta para o m�todo 'jogo()';
			}

			if (contadorPontosMaximos == 90) {																						// Se chegar a 90 pontos, o jogador vence;
				System.out.println("\nParab�ns! Voc� venceu!");
				System.out.println("__________________________________________________________");
			}
		}
	}

	public static void tabuleiroOcultoCM() {																		// Tabuleiro oculto do jogo;
		System.out.println("");																						// Esse m�todo literalmente s� serve para criar o tabuleiro...;
		// ... corretamente, aplicando um s�mbolo qualquer para a mina (nesse caso, "B");
		for (int x = 0; x < tabOcultoCampoMinado.length; x++) {														// Ele OBRIGATORIAMENTE precisa ser usado l� no m�todo 'jogo()' NAQUELA ORDEM, pois sem ele o...
			if (x == 0) {																							// ... o pr�ximo m�todo n�o ser� impresso corretamente;
				System.out.println("-------------------------------------------------------------------");
				System.out.println("| ### | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | [10] |");			// A linha 0 (x == 0) vai ser exclusiva para imprimir os n�mero de apoio horizontais;
				System.out.println("-------------------------------------------------------------------");			// Um m�todo diferente foi tentado abaixo. Ambos d�o o mesmo resultado;
				x++;
			}
			for (int y = 0; y < tabOcultoCampoMinado[x].length; y++) {
				if (y == 0) {
					if (x < 10) {
						System.out.print("|  " + (x) + "  ");
					} else if (x >= 10) {
						System.out.print("| " + (x) + "  ");
					}
				} else {
					tabOcultoCampoMinado[x][y] = " ";																// Simbolo aleat�rio para indicar a posi��o sem mina (no caso, um " ");
					System.out.print("|  " + tabOcultoCampoMinado[x][y] + "  ");
					if (y == 10) {
						System.out.print("|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

	}

	public static void imprimirTabuleiroOcultoCM() {																// Tabuleiro que vai ser mostrado quando o jogador come�ar a tentar;
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("| ### | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | [10] |");
		System.out.println("-------------------------------------------------------------------");
		for (int x = 1; x < tabOcultoCampoMinado.length; x++) {														// Veja que o 'x' come�ou com 1, e n�o com zero;
			for (int y = 0; y < tabOcultoCampoMinado[x].length; y++) {												// Isso se deve para que a posi��o [1][1] no tabuleiro n�o seja a posi��o [0][1] no Array Bidimensional;
				if (y == 0) {
					if (x < 10) {
						System.out.print("|  " + (x) + "  ");
					} else if (x >= 10) {
						System.out.print("| " + (x) + "  ");
					}
				} else {
					System.out.print("|  " + tabOcultoCampoMinado[x][y] + "  ");
					if (y == 10) {
						System.out.print("|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

	}


}
