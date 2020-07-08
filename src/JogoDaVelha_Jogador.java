import java.util.Scanner;

public class JogoDaVelha_Jogador {

    private final JogoDaVelha_Mapa mapa;
    private char letra = 'X';

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga(Scanner teclado) {
    	
    	System.out.println("Jogador");
    	
        System.out.print("Digite a linha: ");
        int linha = teclado.nextInt();
        
        System.out.print("Digite a coluna: ");
        int coluna = teclado.nextInt();

        if (linha > 2 || linha < 0 || coluna > 2 || coluna < 0) {
            System.out.println("\nEntrada fora dos limites do mapa!\n");
            return false;
        } 
        else {
        	
            if (mapa.jogar(linha, coluna, letra)) {
            	
            	if(mapa.ganhou(letra)) 
            		System.out.println("\nJogador ganhou!");
            	
                return true;
            } 
            else {
                System.out.println("\nA posição já está ocupada!\n");
                return false;
            }
        }
    }
}