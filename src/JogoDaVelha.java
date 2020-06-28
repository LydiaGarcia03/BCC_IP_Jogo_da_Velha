import java.util.Scanner;

public class JogoDaVelha {

    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPc;
    private static JogoDaVelha_Jogador jogoJogador;

    protected static void jogar(Scanner teclado) {
    	
        jogoMapa.limpaMapa();

        int jogadorInicial = jogoMapa.sortear(0, 2);
        boolean pcJogando = jogadorInicial == 0;

        for (int i = 0; i <= 9; i++) {
        	
        	if(i == 0) 
        		System.out.println("\t\t  JOGO DA VELHA");
        	
            jogoMapa.desenha(i);
            
            if (pcJogando) {

                boolean flag = jogoPc.joga();
                
                while (!flag) {
                    flag = jogoPc.joga();
                }
                
            } else {
                boolean flag = jogoJogador.joga(teclado);
                while (!flag) {
                    flag = jogoJogador.joga(teclado);
                }
            }
            pcJogando = !pcJogando;
        }
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

	
