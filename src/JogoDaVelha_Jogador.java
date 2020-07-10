import java.util.Scanner;

public class JogoDaVelha_Jogador {

    private final JogoDaVelha_Mapa mapa;
    private char letra = 'X';

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga(Scanner teclado) {

        System.out.println("Jogador");
        int linha;
        int coluna;
        //Forçando entrar no loop
        boolean flag = false;

        while (!flag) {
            System.out.print("Digite a linha: ");
            linha = teclado.nextInt();

            System.out.print("Digite a coluna: ");
            coluna = teclado.nextInt();

            if (linha > 2 || linha < 0 || coluna > 2 || coluna < 0) {
                System.out.println("\nEntrada fora dos limites do mapa!\n");
                //Continua no loop até o jogador fazer uma jogada válida
                flag = false;
            } else {
                flag = mapa.jogar(linha, coluna, letra);
                if (!flag) {
                    System.out.println("A posição já está ocupada!");
                }
            }
        }

        boolean ganhou = mapa.ganhou(letra);
        if (ganhou) {
            System.out.println("\nJogador ganhou!");
        }

        return ganhou;
    }
}