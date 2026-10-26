import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Um inimigo do jogo. */
public class Inimigo implements Prototipo<Inimigo> {

    private String nome;
    private Sprite sprite;
    private Atributos atributos;
    private List<Habilidade> habilidades;
    private Inventario inventario;
    private Posicao posicao;

    public Inimigo(String nome, Sprite sprite, Atributos atributos) {
        this.nome = nome;
        this.sprite = sprite;
        this.atributos = atributos;
        this.habilidades = new ArrayList<>();
        this.inventario = new Inventario();
        this.posicao = new Posicao(0, 0);
    }

    public Inimigo(Inimigo origem) {
        this.nome = origem.nome;
        this.sprite = origem.sprite;
        this.atributos = new Atributos(origem.atributos);
        this.habilidades = new ArrayList<>(origem.habilidades);
        this.inventario = new Inventario(origem.inventario);
        this.posicao = new Posicao(origem.posicao);
    }

    @Override
    public Inimigo clonar() { return new Inimigo(this); }

    public void aprenderHabilidade(Habilidade habilidade) {
        habilidades.add(habilidade);
    }

    public void adicionarItem(String item) {
        inventario.adicionar(item);
    }

    public void receberDano(int dano) {
        atributos.receberDano(dano);
    }

    public void posicionarEm(int x, int y) {
        posicao.moverPara(x, y);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Sprite getSprite() { return sprite; }
    public Atributos getAtributos() { return atributos; }
    public List<Habilidade> getHabilidades() { return Collections.unmodifiableList(habilidades); }
    public Inventario getInventario() { return inventario; }
    public Posicao getPosicao() { return posicao; }

    @Override
    public String toString() {
        return nome + " [" + atributos + "] em " + posicao + ", itens " + inventario;
    }
}
