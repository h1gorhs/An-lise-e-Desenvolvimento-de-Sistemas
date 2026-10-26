import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Itens que o inimigo deixa cair ao ser derrotado. É MUTÁVEL. */
public class Inventario {

    private final List<String> itens = new ArrayList<>();

    public Inventario() { }
    public Inventario(Inventario origem) { this.itens.addAll(origem.itens); }

    public void adicionar(String item) {
        itens.add(item);
    }

    public List<String> getItens() {
        return Collections.unmodifiableList(itens);
    }

    @Override
    public String toString() {
        return itens.toString();
    }
}
