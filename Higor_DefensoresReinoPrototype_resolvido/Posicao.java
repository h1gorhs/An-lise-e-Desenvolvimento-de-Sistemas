/** Posição do inimigo no mapa. É MUTÁVEL: muda a cada movimento. */
public class Posicao {

    private int x;
    private int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Posicao(Posicao origem) { this.x = origem.x; this.y = origem.y; }

    public void moverPara(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
