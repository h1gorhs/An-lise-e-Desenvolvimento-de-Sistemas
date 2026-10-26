import java.util.ArrayList;
import java.util.List;

/**
 * Monta as ondas de inimigos do jogo.
 *
 * NÃO ALTERE ESTA CLASSE. Ela é o "cliente" da fábrica: depois da
 * refatoração, ela deve continuar funcionando sem nenhuma mudança.
 */
public class GeradorDeOnda {

    private final FabricaDeInimigos fabrica = new FabricaDeInimigos();

    public List<Inimigo> gerarOnda(int numero) {
        List<Inimigo> onda = new ArrayList<>();
        adicionar(onda, "goblin", 3 + numero);
        adicionar(onda, "goblin-arqueiro", numero / 2);
        adicionar(onda, "esqueleto", numero / 3);
        adicionar(onda, "orc", numero / 2);
        if (numero % 5 == 0) {
            adicionar(onda, "orc-chefe", 1);
            adicionar(onda, "dragao", 1);
        }

        // posiciona os inimigos em fila, fora da tela, na entrada do mapa
        for (int i = 0; i < onda.size(); i++) {
            onda.get(i).posicionarEm(-40 * (i + 1), 100 + (i % 3) * 50);
        }
        return onda;
    }

    private void adicionar(List<Inimigo> onda, String tipo, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            onda.add(fabrica.criar(tipo));
        }
    }
}
