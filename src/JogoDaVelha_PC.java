
public class JogoDaVelha_PC {

    private final JogoDaVelha_Mapa mapa;
    private char letra = 'O';

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga() {
   
        int linha = mapa.sortear(0, 3);
        int coluna = mapa.sortear(0, 3);
    	  
        boolean flag = mapa.jogar(linha, coluna, letra);

        if (flag) {
        	
            System.out.println("PC");
            System.out.println("Linha: " + linha);
            System.out.println("Coluna: " + coluna);

            if(mapa.ganhou(letra)) 
            	System.out.println("\nPC ganhou!");
            	
        }
        
        return flag;
    }
}
