
public class JogoDaVelha_Mapa {
	
	private char[][] mapa = new char[3][3];

	// Método sortear dado pelo Dalton
	private static int sortear(int inicio, int fim) {
		return (int) ((Math.random() * fim) - inicio);
	}
	
	public void limpaMapa() {}
	
	public void desenha(int jogada) {
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				mapa[i][j] = ' ';
			}
		}
		
		System.out.println("\n\t\t    JOGADA 0" + jogada);
		System.out.println("╔═══════════════════════════════════════════════╗");
		for(int i = 0; i < 3; i++) {
			System.out.print("║");
			for(int j = 0; j < 3; j++) {
				System.out.print("\t" + mapa[i][j] + "\t");
				if(j != 2) 
					System.out.print("|");
			}
			System.out.println("║");
			if(i != 2) 
				System.out.println("╟───────────────────────────────────────────────╢");				
		}
		System.out.println("╚═══════════════════════════════════════════════╝	");
		
	}
	
	public boolean jogar(int l, int c, char jogador) { 
		
		
		
		return false;
	}
	
	public boolean ganhou(char jogador) { return false;}
	
}
