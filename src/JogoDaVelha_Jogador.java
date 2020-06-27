import java.util.Scanner;

public class JogoDaVelha_Jogador {

    private final JogoDaVelha_Mapa mapa;
    private char letra;

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga(Scanner teclado) {
        System.out.println("Digite a linha: ");
        int linha = teclado.nextInt();
        System.out.println("Digite a coluna: ");
        int coluna = teclado.nextInt();

        if (linha > 2 || coluna > 2) {
            System.out.println("Entrada fora dos limites do mapa!");
            return false;
        } else {
            if (mapa.jogar(linha, coluna, 'X')) {
                return true;
            } else {
                System.out.println("A posição já está ocupada!");
                return false;
            }
        }
    }
}