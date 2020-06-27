
public class JogoDaVelha_PC {

    private final JogoDaVelha_Mapa mapa;
    private char letra;

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga() {
        int linha = mapa.sortear(0, 3);
        int coluna = mapa.sortear(0, 3);

        return mapa.jogar(linha, coluna, 'O');
    }
}
