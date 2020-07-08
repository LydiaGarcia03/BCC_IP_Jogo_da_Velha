import java.util.Scanner;

public class JogoDaVelha {

    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPc;
    private static JogoDaVelha_Jogador jogoJogador;

    private static void jogar(Scanner teclado) {
    	
    	char opJogar = 'S';
    	
    	do {

	        jogoMapa.limpaMapa();
	
	        int jogadorInicial = jogoMapa.sortear(0, 2);
	        boolean pcJogando = jogadorInicial == 0;
	
	        for (int i = 1; i <= 9; i++) {
	        	
	        	if(i == 1) {
	        		System.out.println("\t\t  JOGO DA VELHA");
	        		jogoMapa.desenha(i-1);
	        	}
	            
	            if (pcJogando) {

	            	boolean flag = jogoPc.joga();
	            	
	            	while (!flag)
						flag = jogoPc.joga();

	            	jogoMapa.desenha(i);
	            	
	            	if(jogoMapa.ganhou('O')) 
	            		break;
	            		                
	            } else {
	            	
	            	boolean flag = jogoJogador.joga(teclado);
	            	
	            	while (!flag)
	            		flag = jogoJogador.joga(teclado);
	            
	            	jogoMapa.desenha(i);
	            	
	            	if(jogoMapa.ganhou('X')) 
	            		break;
	            	
	            }
	            
	            if(i == 9 && !jogoMapa.ganhou('O') && !jogoMapa.ganhou('X')) {
	        		System.out.println("\nEmpate!");
	        		break;
	        	}
	          
	            pcJogando = !pcJogando;
	        }
    	
	        System.out.println("\nDeseja jogar novamente? (s/n)");
	        opJogar = teclado.next().charAt(0);
	        
	        System.out.println("\n\n═════════════════════════════════════════════════\n");
	        
    	} while(opJogar == 'S' || opJogar == 's');
    	
    	System.out.print("\t\t FIM JOGO DA VELHA");
    }

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);

        jogoMapa = new JogoDaVelha_Mapa();
        jogoPc = new JogoDaVelha_PC(jogoMapa);
        jogoJogador = new JogoDaVelha_Jogador(jogoMapa);

        jogar(teclado);
        
        teclado.close();
    }
}

	
