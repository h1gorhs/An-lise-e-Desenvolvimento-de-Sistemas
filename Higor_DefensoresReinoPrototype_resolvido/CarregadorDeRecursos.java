import java.util.Random;

/**
 * Simula a leitura de arquivos de imagem do disco (operação LENTA).
 *
 * NÃO ALTERE ESTA CLASSE. Ela é usada pelos testes para contar
 * quantas vezes um sprite foi carregado.
 */
public final class CarregadorDeRecursos {

    private static int carregamentos = 0;

    private CarregadorDeRecursos() { }

    public static Sprite carregarSprite(String arquivo) {
        carregamentos++;
        try {
            Thread.sleep(100); // simula a leitura e decodificação do arquivo
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        byte[] pixels = new byte[64 * 64 * 4]; // 64x64 pixels RGBA = 16 KB
        new Random(arquivo.hashCode()).nextBytes(pixels);
        return new Sprite(arquivo, 64, 64, pixels);
    }

    public static int totalDeCarregamentos() {
        return carregamentos;
    }

    public static void zerarContagem() {
        carregamentos = 0;
    }
}
