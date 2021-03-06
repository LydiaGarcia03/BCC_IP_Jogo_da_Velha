
public class JogoDaVelha_Mapa {
	
	private final char[][] mapa = new char[3][3];

	// Método sortear dado pelo Dalton
	int sortear(int inicio, int fim) {
		return (int) ((Math.random() * fim) - inicio);
	}
	
	public void limpaMapa() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				mapa[i][j] = ' ';
			}
		}
	}
	
	public void desenha(int jogada) {
		
		System.out.println("\n\t\t    JOGADA 0" + jogada);
		
//		System.out.println("|===============================================|");
//		for(int i = 0; i < 3; i++) {
//			System.out.print("|");
//			for(int j = 0; j < 3; j++) {
//				System.out.print("\t" + mapa[i][j] + "\t");
//				if(j != 2)
//					System.out.print("|");
//			}
//			System.out.println("|");
//			if(i != 2)
//				System.out.println("|-----------------------------------------------|");
//		}
//		System.out.println("|===============================================|\n");

		System.out.println("\n╔═══════════════════════════════════════════════╗");
		for(int i = 0; i < 3; i++) {
			System.out.print("║");
			for(int j = 0; j < 3; j++) {
				System.out.print("\t" + mapa[i][j] + "\t");
				if(j != 2) 
					System.out.print("│");
			}
			System.out.println("║");
			if(i != 2) 
				System.out.println("║ ──────────────┼───────────────┼────────────── ║");				
		}
		System.out.println("╚═══════════════════════════════════════════════╝\n");
	}
	
	public boolean jogar(int l, int c, char jogador) { 
		
		if (mapa[l][c] == ' ') {
			mapa[l][c] = jogador;
			return true;				
		} 
		else {
			return false;
		}
	}
	
	public boolean ganhou(char jogador) {

		return (mapa[0][0] == jogador && mapa[0][1] == jogador && mapa[0][2] == jogador)
				|| (mapa[1][0] == jogador && mapa[1][1] == jogador && mapa[1][2] == jogador)
				|| (mapa[2][0] == jogador && mapa[2][1] == jogador && mapa[2][2] == jogador)
				|| (mapa[0][0] == jogador && mapa[1][0] == jogador && mapa[2][0] == jogador)
				|| (mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[2][1] == jogador)
				|| (mapa[0][2] == jogador && mapa[1][2] == jogador && mapa[2][2] == jogador)
				|| (mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador)
				|| (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador);
	}
}
