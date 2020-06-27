import java.util.Scanner;

public class JogoDaVelha {

    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPc;
    private static JogoDaVelha_Jogador jogoJogador;

    protected static void jogar(Scanner teclado) {
        jogoMapa.limpaMapa();
        jogoMapa.desenha(1);

        int jogadorInicial = jogoMapa.sortear(0, 2);
        boolean pcJogando = jogadorInicial == 0;

        for (int contaJogadas = 1; contaJogadas <= 9; contaJogadas++) {
            if (pcJogando) {
                System.out.println("PC");
            } else {
                System.out.println("Jogador");
                while (!jogoJogador.joga(teclado)) {
                    jogoJogador.joga(teclado);
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

	
