
public class JogoDaVelha_Mapa {
	
	private char[][] mapa;

	// Método sortear dado pelo Dalton
	private static int sortear(int inicio, int fim) {
		return (int) ((Math.random()*fim)-inicio);
	}
	
	public void limpaMapa() {}
	
	public void desenha(int jogada) {
		
		System.out.println("----------  Jogada: "+jogada);
		System.out.println("|  |  |  |");
		System.out.println("----------");
		System.out.println("|  |  |  |");
		System.out.println("----------");
		System.out.println("|  |  |  |");
		System.out.println("--------------------");
	}
	
	public boolean jogar(int l, int c, char jogador) { return false;}
	
	public boolean ganhou(char jogador) { return false;}
	
}
