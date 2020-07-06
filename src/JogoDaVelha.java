import java.util.Scanner;

public class JogoDaVelha {

    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPc;
    private static JogoDaVelha_Jogador jogoJogador;

    protected static void jogar(Scanner teclado) {
    	
    	char opJogar = 'S';
    	
    	do {
    		
	        jogoMapa.limpaMapa();
	
	        int jogadorInicial = jogoMapa.sortear(0, 2);
	        boolean pcJogando = jogadorInicial == 0;
	
	        for (int i = 0; i <= 9; i++) {
	        	
	        	if(i == 0) 
	        		System.out.println("\t\t  JOGO DA VELHA");
	        	
	        	if(i == 9) {
	        		System.out.println("\nEmpate!");
	        		break;
	        	}
	        	
	            jogoMapa.desenha(i);
	            
	            if (pcJogando) {
	            	
	            	jogoPc.joga();
	
	                if(jogoMapa.ganhou('O')) {
	                	jogoMapa.desenha(i);
	                	System.out.println("\nPC ganhou!");
	                	break;
	                }
	                
	            } else {
	            	
	            	boolean flag = jogoJogador.joga(teclado);
	            	
	            	if(!flag)
	            		jogoJogador.joga(teclado);
	            	
	            	if(jogoMapa.ganhou('X')) {
	            		jogoMapa.desenha(i);
						System.out.println("\nJogador ganhou!");
						break;
	            	}
	            	
	            }
	          
	            pcJogando = !pcJogando;
	          
	        }
    	
	        System.out.println("\nDeseja jogar novamente? (s/n)");
	        opJogar = teclado.next().charAt(0);
	        
    	} while(opJogar == 'S' || opJogar == 's');
    	
    	System.out.print("\n\n\t\t FIM JOGO DA VELHA");
    
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

	
