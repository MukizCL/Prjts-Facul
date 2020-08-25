package br.ucsal;

import java.util.Scanner;

public class JogoBatalhaNaval4 {

	public static int linhas = 11;
	public static int linhas2 = 11;
	public static int colunas = 11;
	public static int colunas2 = 11;
	public static String[][] tabJogo1 = new String[linhas][colunas];
	public static String[][] tabJogo2 = new String[linhas2][colunas2];
	

	public static void main(String[] args) {

		inicioBatalhaNaval();
		
	}

	public static void inicioBatalhaNaval() {

		tutorial();
		criarTabuleiro1();		
		intrucoesPosicionamento();
		posicaoNaviosJog1();
		intrucoesPosicionamento();
		criarTabuleiro2();
		posicaoNaviosJog2();
		contadorPontos();
		
	}

	public static void tutorial() {
		System.out.println("[ B A T A L H A  N A V A L ]");
		System.out.println("");
		System.out.println(">> Bem-vindo ao jogo 'Batalha Naval', Almirante!");
		System.out.println(">> Nesse jogo, o seu objetivo é descobrir onde estão os navios inimigos e afundá-los.");
		System.out.println(">> Os navios (ambos seus e do inimigo) se encontraram num tabuleiro 10 x 10.");
		System.out.println(">> Quem conseguir afundar TODOS os 4 navios primeiro será o vencedor.");
		System.out.println(">> Você será guiado a distribuir o seus navios em alguns instantes.");
		System.out.println(">> Boa sorte!");
		System.out.println("__________________________________________________________");

	}

	public static void intrucoesPosicionamento() {

		System.out.println("\nNós iremos agora começar a fase de posicionamento dos navios.");
		System.out.println("\nLeia com ATENÇÃO as regras abaixo:");
		System.out.println("- Existem 4 navios a serem distribuidos pelo tabuleiro.");
		System.out.println("- Os navios devem estar conectados e em linha reta (horizontal ou vertical);");
		System.out.println("- Todos os segmentos do navio devem estar dentro do tabuleiro.");
		System.out.println("- Para determinar a posição, será pedido primeiramente a COLUNA e depois a LINHA.");
		System.out.println("\nOs navios e seus comprimentos são:");
		System.out.println( "  * Porta aviões --------- 5 segmentos;\r\n" + 
				"  * Navios-tanque -------- 4 segmentos;\r\n" + 
				"  * Contratorpedeiros ---- 3 segmentos;\r\n" + 
				"  * Submarinos ----------- 2 segmentos;");

		System.out.println("\n[AVISO] Uma vez posicionado, o navio NÃO PODE ser removido do tabuleiro. Escolha com cuidado a posição.");
	}

	public static void posicaoNaviosJog1() {
		
		System.out.println("\n >>> JOGADOR 1# <<<");
		posicaoSubJog1();
		posicaoCTJog1();
		posicaoNTJog1();
		posicaoPAJog1();
		
	}

	public static void posicaoSubJog1() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\nO primeiro navio será o SUBMARINO.");

		do {			
			System.out.print("Por favor, escolha onde o primeiro segmento do 'SUBMARINO' deverá ficar [COLUNA]: ");
			x = userInput.nextInt();
			System.out.print("Por favor, escolha onde o primeiro segmento do 'SUBMARINO' deverá ficar [LINHA]: ");
			y = userInput.nextInt();

			if (x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2)) {
				System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
				System.out.println("");
			}

		} while(x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2));

		tabJogo1[x][y] = "O";		

		do {
		System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
		vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
		} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

		switch (vertOuHoriz) {
		case "H":
			
			do {
			System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
			dirOuEsq = userInput.next().toUpperCase().substring(0, 1);
			} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));

			switch (dirOuEsq) {
			case "D":  
					tabJogo1[x][(y + 1)] = "O";
				break;

			case "E":
					tabJogo1[x][(y - 1)] = "O";
				break;

			default:
				System.out.println("Letra digitada não corresponde a uma opção.");
				break;
			}
			break;

		case "V":
			
			do {
			System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
			cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
			} while (!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

			switch (cimaOuBaixo) {
			case "C":	
					tabJogo1[(x - 1)][y] = "O";
				break;
				
			case "B":
					tabJogo1[(x + 1)][y] = "O";
				break;

			default:				
				break;
			}
			break;

		default:			
			break;
		}		

		imprimirTabuleiro1();

	}

	public static void posicaoCTJog1() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\n O segundo navio será o CONTRATORPEDEIRO.");

		do {
			do {		
				System.out.print("Por favor, escolha onde o primeiro segmento do 'CONTRATORPEDEIRO' deverá ficar [COLUNA]: ");
				x = userInput.nextInt();
				System.out.print("Por favor, escolha onde o primeiro segmento do 'CONTRATORPEDEIRO' deverá ficar [LINHA]: ");
				y = userInput.nextInt();

				if (x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2)) {
					System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
					System.out.println("");
				}

			} while(x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2));

			if (tabJogo1[x][y] == "O") {
				System.out.println("\nPosição já possui uma peça. Tente novamente.");
				System.out.println("");
			}
		} while(tabJogo1[x][y] == "O");

		tabJogo1[x][y] = "O";
			
			do {
				System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
				vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
			} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

			switch (vertOuHoriz) {
			case "H":				
				do {					
					do {
						System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
						dirOuEsq = userInput.next().toUpperCase().substring(0, 1);	
					} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));	

					switch (dirOuEsq) {
					case "D":
						if (tabJogo1[x][(y + 1)] == "~" && tabJogo1[x][(y + 2)] == "~") {
							tabJogo1[x][(y + 1)] = "O";
							tabJogo1[x][(y + 2)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "E":
						if (tabJogo1[x][(y - 1)] == "~" && tabJogo1[x][(y - 2)] == "~") {
							tabJogo1[x][(y - 1)] = "O";
							tabJogo1[x][(y - 2)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;					
					}
					
				} while ((tabJogo1[x][(y - 1)] == "~" && tabJogo1[x][(y - 2)] == "~") || (tabJogo1[x][(y + 1)] == "~" && tabJogo1[x][(y + 2)] == "~"));

				break;
				
			case "V":
				do {					
					do {
						System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
						cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
					} while(!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

					switch (cimaOuBaixo) {
					case "C":
						if (tabJogo1[(x - 1)][y] == "~" && tabJogo1[(x - 2)][y] == "~") {
							tabJogo1[(x - 1)][y] = "O";
							tabJogo1[(x - 2)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "B":
						if (tabJogo1[(x + 1)][y] == "~" && tabJogo1[(x + 2)][y] == "~") {
							tabJogo1[(x + 1)][y] = "O";
							tabJogo1[(x + 2)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;
					}
					break;

				} while ((tabJogo1[(x - 1)][y] == "~" && tabJogo1[(x - 2)][y] == "~") || (tabJogo1[(x + 1)][y] == "~" && tabJogo1[(x + 2)][y] == "~"));
				
				break;
			}
		
		imprimirTabuleiro1();
	}

	public static void posicaoNTJog1() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\n O segundo navio será o 'NAVIO-TANQUE'.");

		do {
			do {		
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [COLUNA]: ");
				x = userInput.nextInt();
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [LINHA]: ");
				y = userInput.nextInt();

				if (x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2)) {
					System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
					System.out.println("");
				}

			} while(x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2));

			if (tabJogo1[x][y] == "O") {
				System.out.println("\nPosição já possui uma peça. Tente novamente.");
				System.out.println("");
			}
		} while(tabJogo1[x][y] == "O");

		tabJogo1[x][y] = "O";
			
			do {
				System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
				vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
			} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

			switch (vertOuHoriz) {
			case "H":				
				do {					
					do {
						System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
						dirOuEsq = userInput.next().toUpperCase().substring(0, 1);	
					} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));	

					switch (dirOuEsq) {
					case "D":
						if (tabJogo1[x][(y + 1)] == "~" && tabJogo1[x][(y + 2)] == "~" && tabJogo1[x][(y + 3)] == "~") {
							tabJogo1[x][(y + 1)] = "O";
							tabJogo1[x][(y + 2)] = "O";
							tabJogo1[x][(y + 3)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "E":
						if (tabJogo1[x][(y - 1)] == "~" && tabJogo1[x][(y - 2)] == "~" && tabJogo1[x][(y - 3)] == "~") {
							tabJogo1[x][(y - 1)] = "O";
							tabJogo1[x][(y - 2)] = "O";
							tabJogo1[x][(y - 3)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;					
					}
					
				} while ((tabJogo1[x][(y - 1)] == "~" && tabJogo1[x][(y - 2)] == "~" && tabJogo1[x][(y - 3)] == "~") || (tabJogo1[x][(y + 1)] == "~" && tabJogo1[x][(y + 2)] == "~" && tabJogo1[x][(y + 3)] == "~"));

				break;
				
			case "V":
				do {					
					do {
						System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
						cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
					} while(!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

					switch (cimaOuBaixo) {
					case "C":
						if (tabJogo1[(x - 1)][y] == "~" && tabJogo1[(x - 2)][y] == "~"  && tabJogo1[(x - 3)][y] == "~") {
							tabJogo1[(x - 1)][y] = "O";
							tabJogo1[(x - 2)][y] = "O";
							tabJogo1[(x - 3)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "B":
						if (tabJogo1[(x + 1)][y] == "~" && tabJogo1[(x + 2)][y] == "~" && tabJogo1[(x + 3)][y] == "~") {
							tabJogo1[(x + 1)][y] = "O";
							tabJogo1[(x + 2)][y] = "O";
							tabJogo1[(x + 3)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;
					}
					break;

				} while ((tabJogo1[(x - 1)][y] == "~" && tabJogo1[(x - 2)][y] == "~" && tabJogo1[(x - 3)][y] == "~") || (tabJogo1[(x + 1)][y] == "~" && tabJogo1[(x + 2)][y] == "~" && tabJogo1[(x + 3)][y] == "~"));
				
				break;
			}
		
		imprimirTabuleiro1();
	}

	public static void posicaoPAJog1() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\n O segundo navio será o 'NAVIO-TANQUE'.");

		do {
			do {		
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [COLUNA]: ");
				x = userInput.nextInt();
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [LINHA]: ");
				y = userInput.nextInt();

				if (x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2)) {
					System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
					System.out.println("");
				}

			} while(x > (tabJogo1.length - 2) || y > (tabJogo1.length - 2));

			if (tabJogo1[x][y] == "O") {
				System.out.println("\nPosição já possui uma peça. Tente novamente.");
				System.out.println("");
			}
		} while(tabJogo1[x][y] == "O");

		tabJogo1[x][y] = "O";
			
			do {
				System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
				vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
			} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

			switch (vertOuHoriz) {
			case "H":				
				do {					
					do {
						System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
						dirOuEsq = userInput.next().toUpperCase().substring(0, 1);	
					} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));	

					switch (dirOuEsq) {
					case "D":
						if (tabJogo1[x][(y + 1)] == "~" && tabJogo1[x][(y + 2)] == "~" && tabJogo1[x][(y + 3)] == "~"  && tabJogo1[x][(y + 4)] == "~") {
							tabJogo1[x][(y + 1)] = "O";
							tabJogo1[x][(y + 2)] = "O";
							tabJogo1[x][(y + 3)] = "O";
							tabJogo1[x][(y + 4)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "E":
						if (tabJogo1[x][(y - 1)] == "~" && tabJogo1[x][(y - 2)] == "~" && tabJogo1[x][(y - 3)] == "~" && tabJogo1[x][(y - 4)] == "~") {
							tabJogo1[x][(y - 1)] = "O";
							tabJogo1[x][(y - 2)] = "O";
							tabJogo1[x][(y - 3)] = "O";
							tabJogo1[x][(y - 4)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;					
					}
					
				} while ((tabJogo1[x][(y - 1)] == "~" && tabJogo1[x][(y - 2)] == "~" && tabJogo1[x][(y - 3)] == "~" && tabJogo1[x][(y - 4)] == "~") || 
						 (tabJogo1[x][(y + 1)] == "~" && tabJogo1[x][(y + 2)] == "~" && tabJogo1[x][(y + 3)] == "~" && tabJogo1[x][(y + 4)] == "~"));

				break;
				
			case "V":
				do {					
					do {
						System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
						cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
					} while(!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

					switch (cimaOuBaixo) {
					case "C":
						if (tabJogo1[(x - 1)][y] == "~" && tabJogo1[(x - 2)][y] == "~" && tabJogo1[(x - 3)][y] == "~" && tabJogo1[(x - 4)][y] == "~") {
							tabJogo1[(x - 1)][y] = "O";
							tabJogo1[(x - 2)][y] = "O";
							tabJogo1[(x - 3)][y] = "O";
							tabJogo1[(x - 4)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "B":
						if (tabJogo1[(x + 1)][y] == "~" && tabJogo1[(x + 2)][y] == "~" && tabJogo1[(x + 3)][y] == "~"  && tabJogo1[(x + 4)][y] == "~") {
							tabJogo1[(x + 1)][y] = "O";
							tabJogo1[(x + 2)][y] = "O";
							tabJogo1[(x + 3)][y] = "O";
							tabJogo1[(x + 4)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;
					}
					break;

				} while ((tabJogo1[(x - 1)][y] == "~" && tabJogo1[(x - 2)][y] == "~" && tabJogo1[(x - 3)][y] == "~" && tabJogo1[(x - 4)][y] == "~") || 
						 (tabJogo1[(x + 1)][y] == "~" && tabJogo1[(x + 2)][y] == "~" && tabJogo1[(x + 3)][y] == "~" && tabJogo1[(x + 4)][y] == "~"));
				
				break;
			}
		
		imprimirTabuleiro1();
	}

	public static void criarTabuleiro1() {
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("| [0] | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | ### |");
		System.out.println("-------------------------------------------------------------------");
		for (int x = 0; x < tabJogo1.length; x++) {
			for (int y = 0; y < tabJogo1[x].length; y++) {
				if(y < 10) {
					tabJogo1[x][y] = "~";
					System.out.print("|  " + tabJogo1[x][y] + "  ");
				} else {
					if (x < 10) {
						System.out.print("| ["+ x + "] |");
					} else {
						System.out.print("| ["+ x + "]|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

		System.out.println("\nLEGENDA:");
		System.out.println("| ~ | = Quadrado intocado.");
		System.out.println("| N | = Quadrado sem nada.");
		System.out.println("| O | = Quadrado com navio (do jogador).");
		System.out.println("| @ | = Quadrado com navio atingido.");
		System.out.println("__________________________________________________________");

	}
	
	public static void imprimirTabuleiro1() {
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("| [0] | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | ### |");
		System.out.println("-------------------------------------------------------------------");
		for (int x = 0; x < tabJogo1.length; x++) {
			for (int y = 0; y < tabJogo1[x].length; y++) {
				if(y < 10) {					
					System.out.print("|  " + tabJogo1[x][y] + "  ");
				} else {
					if (x < 10) {
						System.out.print("| ["+ x + "] |");
					} else {
						System.out.print("| ["+ x + "]|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

		System.out.println("\nLEGENDA:");
		System.out.println("| ~ | = Quadrado intocado.");
		System.out.println("| N | = Quadrado sem nada.");
		System.out.println("| O | = Quadrado com navio (do jogador).");
		System.out.println("| @ | = Quadrado com navio atingido.");
		System.out.println("__________________________________________________________");

	}
	
	public static void posicaoNaviosJog2() {
		
		System.out.println("\n >>> JOGADOR 2# <<<");		
		posicaoSubJog2();
		posicaoCTJog2();
		posicaoNTJog2();
		posicaoPAJog2();

	}

	public static void posicaoSubJog2() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\nO primeiro navio será o SUBMARINO.");

		do {			
			System.out.print("Por favor, escolha onde o primeiro segmento do 'SUBMARINO' deverá ficar [COLUNA]: ");
			x = userInput.nextInt();
			System.out.print("Por favor, escolha onde o primeiro segmento do 'SUBMARINO' deverá ficar [LINHA]: ");
			y = userInput.nextInt();

			if (x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2)) {
				System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
				System.out.println("");
			}

		} while(x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2));

		tabJogo2[x][y] = "O";
		
		do {
		System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
		vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
		} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

		switch (vertOuHoriz) {
		case "H":
			
			do {
			System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
			dirOuEsq = userInput.next().toUpperCase().substring(0, 1);
			} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));

			switch (dirOuEsq) {
			case "D":  
					tabJogo2[x][(y + 1)] = "O";
				break;

			case "E":
					tabJogo2[x][(y - 1)] = "O";
				break;

			default:
				System.out.println("Letra digitada não corresponde a uma opção.");
				break;
			}
			break;

		case "V":
			
			do {
			System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
			cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
			} while (!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

			switch (cimaOuBaixo) {
			case "C":	
					tabJogo2[(x - 1)][y] = "O";
				break;
				
			case "B":
					tabJogo2[(x + 1)][y] = "O";
				break;

			default:				
				break;
			}
			break;

		default:			
			break;
		}		

		imprimirTabuleiro2();

	}

	public static void posicaoCTJog2() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\n O segundo navio será o CONTRATORPEDEIRO.");

		do {
			do {		
				System.out.print("Por favor, escolha onde o primeiro segmento do 'CONTRATORPEDEIRO' deverá ficar [COLUNA]: ");
				x = userInput.nextInt();
				System.out.print("Por favor, escolha onde o primeiro segmento do 'CONTRATORPEDEIRO' deverá ficar [LINHA]: ");
				y = userInput.nextInt();

				if (x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2)) {
					System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
					System.out.println("");
				}

			} while(x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2));

			if (tabJogo2[x][y] == "O") {
				System.out.println("\nPosição já possui uma peça. Tente novamente.");
				System.out.println("");
			}
		} while(tabJogo2[x][y] == "O");

		tabJogo2[x][y] = "O";
			
			do {
				System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
				vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
			} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

			switch (vertOuHoriz) {
			case "H":				
				do {					
					do {
						System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
						dirOuEsq = userInput.next().toUpperCase().substring(0, 1);	
					} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));	

					switch (dirOuEsq) {
					case "D":
						if (tabJogo2[x][(y + 1)] == "~" && tabJogo2[x][(y + 2)] == "~") {
							tabJogo2[x][(y + 1)] = "O";
							tabJogo2[x][(y + 2)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "E":
						if (tabJogo2[x][(y - 1)] == "~" && tabJogo2[x][(y - 2)] == "~") {
							tabJogo2[x][(y - 1)] = "O";
							tabJogo2[x][(y - 2)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;					
					}
					
				} while ((tabJogo2[x][(y - 1)] == "~" && tabJogo2[x][(y - 2)] == "~") || (tabJogo2[x][(y + 1)] == "~" && tabJogo2[x][(y + 2)] == "~"));

				break;
				
			case "V":
				do {					
					do {
						System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
						cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
					} while(!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

					switch (cimaOuBaixo) {
					case "C":
						if (tabJogo2[(x - 1)][y] == "~" && tabJogo2[(x - 2)][y] == "~") {
							tabJogo2[(x - 1)][y] = "O";
							tabJogo2[(x - 2)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "B":
						if (tabJogo2[(x + 1)][y] == "~" && tabJogo2[(x + 2)][y] == "~") {
							tabJogo2[(x + 1)][y] = "O";
							tabJogo2[(x + 2)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;
					}
					break;

				} while ((tabJogo2[(x - 1)][y] == "~" && tabJogo2[(x - 2)][y] == "~") || (tabJogo2[(x + 1)][y] == "~" && tabJogo2[(x + 2)][y] == "~"));
				
				break;
			}
		
		imprimirTabuleiro2();
	}

	public static void posicaoNTJog2() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\n O segundo navio será o 'NAVIO-TANQUE'.");

		do {
			do {		
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [COLUNA]: ");
				x = userInput.nextInt();
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [LINHA]: ");
				y = userInput.nextInt();

				if (x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2)) {
					System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
					System.out.println("");
				}

			} while(x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2));

			if (tabJogo2[x][y] == "S" || tabJogo2[x][y] == "C") {
				System.out.println("\nPosição já possui uma peça. Tente novamente.");
				System.out.println("");
			}
		} while(tabJogo2[x][y] == "O");

		tabJogo2[x][y] = "O";
			
			do {
				System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
				vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
			} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

			switch (vertOuHoriz) {
			case "H":				
				do {					
					do {
						System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
						dirOuEsq = userInput.next().toUpperCase().substring(0, 1);	
					} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));	

					switch (dirOuEsq) {
					case "D":
						if (tabJogo2[x][(y + 1)] == "~" && tabJogo2[x][(y + 2)] == "~" && tabJogo2[x][(y + 3)] == "~") {
							tabJogo2[x][(y + 1)] = "O";
							tabJogo2[x][(y + 2)] = "O";
							tabJogo2[x][(y + 3)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "E":
						if (tabJogo2[x][(y - 1)] == "~" && tabJogo2[x][(y - 2)] == "~" && tabJogo2[x][(y - 3)] == "~") {
							tabJogo2[x][(y - 1)] = "O";
							tabJogo2[x][(y - 2)] = "O";
							tabJogo2[x][(y - 3)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;					
					}
					
				} while ((tabJogo2[x][(y - 1)] == "~" && tabJogo2[x][(y - 2)] == "~" && tabJogo2[x][(y - 3)] == "~") || (tabJogo2[x][(y + 1)] == "~" && tabJogo2[x][(y + 2)] == "~" && tabJogo2[x][(y + 3)] == "~"));

				break;
				
			case "V":
				do {					
					do {
						System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
						cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
					} while(!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

					switch (cimaOuBaixo) {
					case "C":
						if (tabJogo2[(x - 1)][y] == "~" && tabJogo2[(x - 2)][y] == "~"  && tabJogo2[(x - 3)][y] == "~") {
							tabJogo2[(x - 1)][y] = "O";
							tabJogo2[(x - 2)][y] = "O";
							tabJogo2[(x - 3)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "B":
						if (tabJogo2[(x + 1)][y] == "~" && tabJogo2[(x + 2)][y] == "~" && tabJogo2[(x + 3)][y] == "~") {
							tabJogo2[(x + 1)][y] = "O";
							tabJogo2[(x + 2)][y] = "O";
							tabJogo2[(x + 3)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;
					}
					break;

				} while ((tabJogo2[(x - 1)][y] == "~" && tabJogo2[(x - 2)][y] == "~" && tabJogo2[(x - 3)][y] == "~") || (tabJogo2[(x + 1)][y] == "~" && tabJogo2[(x + 2)][y] == "~" && tabJogo2[(x + 3)][y] == "~"));
				
				break;
			}
		
		imprimirTabuleiro2();
	}

	public static void posicaoPAJog2() {
		String vertOuHoriz = "", dirOuEsq = "", cimaOuBaixo = "";
		int x, y;
		Scanner userInput = new Scanner(System.in);

		System.out.println("\n O segundo navio será o 'NAVIO-TANQUE'.");

		do {
			do {		
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [COLUNA]: ");
				x = userInput.nextInt();
				System.out.print("Por favor, escolha onde o primeiro segmento do 'NAVIO-TANQUE' deverá ficar [LINHA]: ");
				y = userInput.nextInt();

				if (x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2)) {
					System.out.println("\nPosição fora do tabuleiro. Tente novamente.");
					System.out.println("");
				}

			} while(x > (tabJogo2.length - 2) || y > (tabJogo2.length - 2));

			if (tabJogo2[x][y] == "S" || tabJogo2[x][y] == "C" || tabJogo2[x][y] == "T") {
				System.out.println("\nPosição já possui uma peça. Tente novamente.");
				System.out.println("");
			}
		} while(tabJogo2[x][y] == "O");

		tabJogo2[x][y] = "O";
			
			do {
				System.out.print("\nDeseja colocar esse navio na vertical (V) ou horizontal (H)? ");
				vertOuHoriz = userInput.next().toUpperCase().substring(0, 1);
			} while (!vertOuHoriz.equals("V") && !vertOuHoriz.equals("H"));

			switch (vertOuHoriz) {
			case "H":				
				do {					
					do {
						System.out.print("\nDeseja colocar na direita (D) ou esquerda (E) da coordenada escolhida? ");
						dirOuEsq = userInput.next().toUpperCase().substring(0, 1);	
					} while (!dirOuEsq.equals("D") && !dirOuEsq.equals("E"));	

					switch (dirOuEsq) {
					case "D":
						if (tabJogo2[x][(y + 1)] == "~" && tabJogo2[x][(y + 2)] == "~" && tabJogo2[x][(y + 3)] == "~"  && tabJogo2[x][(y + 4)] == "~") {
							tabJogo2[x][(y + 1)] = "O";
							tabJogo2[x][(y + 2)] = "O";
							tabJogo2[x][(y + 3)] = "O";
							tabJogo2[x][(y + 4)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "E":
						if (tabJogo2[x][(y - 1)] == "~" && tabJogo2[x][(y - 2)] == "~" && tabJogo2[x][(y - 3)] == "~" && tabJogo2[x][(y - 4)] == "~") {
							tabJogo2[x][(y - 1)] = "O";
							tabJogo2[x][(y - 2)] = "O";
							tabJogo2[x][(y - 3)] = "O";
							tabJogo2[x][(y - 4)] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;					
					}
					
				} while ((tabJogo2[x][(y - 1)] == "~" && tabJogo2[x][(y - 2)] == "~" && tabJogo2[x][(y - 3)] == "~" && tabJogo2[x][(y - 4)] == "~") || 
						 (tabJogo2[x][(y + 1)] == "~" && tabJogo2[x][(y + 2)] == "~" && tabJogo2[x][(y + 3)] == "~" && tabJogo2[x][(y + 4)] == "~"));

				break;
				
			case "V":
				do {					
					do {
						System.out.print("\nDeseja colocar para cima (C) ou para baixo (B) da coordenada escolhida? ");
						cimaOuBaixo = userInput.next().toUpperCase().substring(0, 1);
					} while(!cimaOuBaixo.equals("C") && !cimaOuBaixo.equals("B"));

					switch (cimaOuBaixo) {
					case "C":
						if (tabJogo2[(x - 1)][y] == "~" && tabJogo2[(x - 2)][y] == "~" && tabJogo2[(x - 3)][y] == "~" && tabJogo2[(x - 4)][y] == "~") {
							tabJogo2[(x - 1)][y] = "O";
							tabJogo2[(x - 2)][y] = "O";
							tabJogo2[(x - 3)][y] = "O";
							tabJogo2[(x - 4)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;

					case "B":
						if (tabJogo2[(x + 1)][y] == "~" && tabJogo2[(x + 2)][y] == "~" && tabJogo2[(x + 3)][y] == "~"  && tabJogo2[(x + 4)][y] == "~") {
							tabJogo2[(x + 1)][y] = "O";
							tabJogo2[(x + 2)][y] = "O";
							tabJogo2[(x + 3)][y] = "O";
							tabJogo2[(x + 4)][y] = "O";
						} else {
							System.out.println("\n[ERRO] Existe um navio em uma das coordenadas a serem preenchidas. Tente novamente.");
						}
						break;
					}
					break;

				} while ((tabJogo2[(x - 1)][y] == "~" && tabJogo2[(x - 2)][y] == "~" && tabJogo2[(x - 3)][y] == "~" && tabJogo2[(x - 4)][y] == "~") || 
						 (tabJogo2[(x + 1)][y] == "~" && tabJogo2[(x + 2)][y] == "~" && tabJogo2[(x + 3)][y] == "~" && tabJogo2[(x + 4)][y] == "~"));
				
				break;
			}
		
		imprimirTabuleiro2();
	}

	public static void criarTabuleiro2() {
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("| [0] | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | ### |");
		System.out.println("-------------------------------------------------------------------");
		for (int x = 0; x < tabJogo2.length; x++) {
			for (int y = 0; y < tabJogo2[x].length; y++) {
				if(y < 10) {	
					tabJogo2[x][y] = "~";
					System.out.print("|  " + tabJogo2[x][y] + "  ");
				} else {
					if (x < 10) {
						System.out.print("| ["+ x + "] |");
					} else {
						System.out.print("| ["+ x + "]|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

		System.out.println("\nLEGENDA:");
		System.out.println("| ~ | = Quadrado intocado.");
		System.out.println("| N | = Quadrado sem nada.");
		System.out.println("| O | = Quadrado com navio (do jogador).");
		System.out.println("| @ | = Quadrado com navio atingido.");
		System.out.println("__________________________________________________________");

	}
	
	public static void imprimirTabuleiro2() {
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("| [0] | [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | ### |");
		System.out.println("-------------------------------------------------------------------");
		for (int x = 0; x < tabJogo2.length; x++) {
			for (int y = 0; y < tabJogo2[x].length; y++) {
				if(y < 10) {			
					System.out.print("|  " + tabJogo2[x][y] + "  ");
				} else {
					if (x < 10) {
						System.out.print("| ["+ x + "] |");
					} else {
						System.out.print("| ["+ x + "]|");
					}
				}

			}
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
		}

		System.out.println("\nLEGENDA:");
		System.out.println("| ~ | = Quadrado intocado.");
		System.out.println("| N | = Quadrado sem nada.");
		System.out.println("| O | = Quadrado com navio (do jogador).");
		System.out.println("| @ | = Quadrado com navio atingido.");
		System.out.println("__________________________________________________________");

	}

	public static void contadorPontos() {
		int contadorPontosMaximosP1 = 0, contadorPontosMaximosP2 = 0;

		for (int contadorTurnos = 1; (contadorPontosMaximosP1 < 14) || (contadorPontosMaximosP2 < 14); ) {
			while (contadorPontosMaximosP1 < 14 && contadorPontosMaximosP2 < 14) {
				if (contadorTurnos % 2 != 0) {					
					int x, y;
					Scanner userInput = new Scanner(System.in);

					System.out.println("\n >>> JOGADOR 1# <<<");
					
					System.out.println("\nTurno: " + contadorTurnos);

					do {
						System.out.print("\nPor favor, escolha uma COLUNA (número entre 0 e 9) para atacar: ");		
						x = userInput.nextInt();

						if (x < 0 && x >= 10) {
							System.out.println("\n[ERRO] Número fora dos parâmetros pedidos, tente novamente.");
						}
					} while (x < 0 && x >= 10);

					do {
						System.out.print("Por favor, escolha uma LINHA (número entre 0 e 9) para atacar: ");
						y = userInput.nextInt();

						if (y < 0 && y >= 10) {
							System.out.println("\n[ERRO] Número fora dos parâmetros pedidos, tente novamente.");
						}
					} while (y < 0 && y >= 10);


					if (tabJogo2[x][y].equals("O")) {
						System.out.println("\nVocê acertou a parte de um navio!");
						tabJogo2[x][y] = "@";
						contadorPontosMaximosP1++;
						System.out.println("Segmentos acertados: " + contadorPontosMaximosP1 + " de 14.");
						imprimirTabuleiro2();

					} else if (!tabJogo2[x][y].equals("O")) {
						System.out.println("\nVocê errou!");
						imprimirTabuleiro2();
					}
					contadorTurnos++;

					if (contadorPontosMaximosP1 == 14) {
						System.out.println("\nJogador 1 venceu!");
						System.out.println("__________________________________________________________");
					}	

				} else if (contadorTurnos % 2 == 0) {					
					int x, y;
					Scanner userInput = new Scanner(System.in);

					System.out.println("\n >>> JOGADOR 2# <<<");
					
					System.out.println("\nTurno: " + contadorTurnos);

					do {
						System.out.print("\nPor favor, escolha uma COLUNA (número entre 0 e 9) para atacar: ");		
						x = userInput.nextInt();

						if (x < 0 && x >= 10) {
							System.out.println("\n[ERRO] Número fora dos parâmetros pedidos, tente novamente.");
						}
					} while (x < 0 && x >= 10);

					do {
						System.out.print("Por favor, escolha uma LINHA (número entre 0 e 9) para atacar: ");
						y = userInput.nextInt();

						if (y < 0 && y >= 10) {
							System.out.println("\n[ERRO] Número fora dos parâmetros pedidos, tente novamente.");
						}
					} while (y < 0 && y >= 10);


					if (tabJogo1[x][y].equals("O")) {
						System.out.println("\nVocê acertou a parte de um navio!");
						tabJogo1[x][y] = "@";
						contadorPontosMaximosP2++;
						System.out.println("Segmentos acertados: " + contadorPontosMaximosP2 + " de 14.");
						imprimirTabuleiro1();

					} else if (!tabJogo1[x][y].equals("O")) {
						System.out.println("\nVocê errou!");
						imprimirTabuleiro1();
					}
					contadorTurnos++;

					if (contadorPontosMaximosP2 == 14) {
						System.out.println("\nJogador 2 venceu!");
						System.out.println("__________________________________________________________");
					}
				}
			}
		}
	}
}