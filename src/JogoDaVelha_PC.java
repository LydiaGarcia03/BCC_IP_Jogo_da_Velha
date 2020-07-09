
public class JogoDaVelha_PC {

    private final JogoDaVelha_Mapa mapa;
    private char letra = 'O';

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga() {

        int linha = mapa.sortear(0, 3);
        int coluna = mapa.sortear(0, 3);
        //Tentativa inicial
        boolean flag = mapa.jogar(linha, coluna, letra);

        while (!flag) {
            //Loop até que o pc faça uma jogada válida
            linha = mapa.sortear(0, 3);
            coluna = mapa.sortear(0, 3);
            flag = mapa.jogar(linha, coluna, letra);
        }

        System.out.println("PC");
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);

        boolean ganhou = mapa.ganhou(letra);
        if (ganhou) {
            System.out.println("\nPC ganhou!");
        }

        return ganhou;
    }
}
