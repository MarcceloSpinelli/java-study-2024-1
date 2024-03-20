
import java.util.Random;

public class Mapa {
    private final int tamanhoMapa;
    private final int[] mapa;
    private final int numTesouros;
    private final int numArmadilhas;

    public Mapa(int tamanhoMapa, int numTesouros, int numArmadilhas) {
        this.tamanhoMapa = tamanhoMapa;
        this.numTesouros = numTesouros;
        this.numArmadilhas = numArmadilhas;
        this.mapa = new int[tamanhoMapa];
        inicializarMapa();
    }

    private void inicializarMapa() {
        Random random = new Random();
        for (int i = 0; i < numTesouros; i++) {
            int posicao = random.nextInt(tamanhoMapa);
            if (mapa[posicao] == 0) {
                mapa[posicao] = 1; // tesouro
            } else {
                i--;
            }
        }
        for (int i = 0; i < numArmadilhas; i++) {
            int posicao = random.nextInt(tamanhoMapa);
            if (mapa[posicao] == 0) {
                mapa[posicao] = -1; // armadilha
            } else {
                i--;
            }
        }
    }

    public int[] getMapa() {
        return mapa;
    }
}
