/**
 * Imagem de um inimigo. É um objeto IMUTÁVEL e PESADO:
 * depois de criado, nada nele muda, e cada um ocupa cerca de 16 KB.
 *
 * Só o CarregadorDeRecursos deve criar sprites.
 */
public final class Sprite {

    private final String arquivo;
    private final int largura;
    private final int altura;
    private final byte[] pixels;

    Sprite(String arquivo, int largura, int altura, byte[] pixels) {
        this.arquivo = arquivo;
        this.largura = largura;
        this.altura = altura;
        this.pixels = pixels;
    }

    public String getArquivo() { return arquivo; }
    public int getLargura() { return largura; }
    public int getAltura() { return altura; }
    public int tamanhoEmBytes() { return pixels.length; }
}
