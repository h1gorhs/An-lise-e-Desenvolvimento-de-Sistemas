import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Testes automáticos da atividade.
 *
 * Executar:  java TesteDaAtividade
 */
public class TesteDaAtividade {

    private static int aprovados = 0;
    private static int reprovados = 0;

    public static void main(String[] args) {
        System.out.println("=== Testes da atividade: padrão Prototype ===\n");

        CarregadorDeRecursos.zerarContagem();
        long inicio = System.nanoTime();
        GeradorDeOnda gerador = new GeradorDeOnda();
        List<List<Inimigo>> ondas = new ArrayList<>();
        for (int n = 1; n <= 10; n++) ondas.add(gerador.gerarOnda(n));
        long ms = (System.nanoTime() - inicio) / 1_000_000;
        List<Inimigo> onda10 = ondas.get(9);

        // ---------- Desempenho e memória ----------
        verificar("01. Gerar as 10 primeiras ondas leva menos de 1 segundo",
                ms < 1000,
                "levou " + ms + " ms. Criar com new e carregar o sprite toda vez é caro.");

        int carregamentos = CarregadorDeRecursos.totalDeCarregamentos();
        verificar("02. Cada arquivo de sprite é lido do disco no máximo uma vez",
                carregamentos <= 4,
                "foram " + carregamentos + " leituras; o jogo só tem 4 arquivos de sprite.");

        verificar("03. Inimigos do mesmo tipo compartilham o mesmo objeto Sprite",
                mesmoSpritePorNome(onda10),
                "existem inimigos iguais com objetos Sprite diferentes (memória desperdiçada).");

        // ---------- Independência entre os clones ----------
        Inimigo g1 = primeiro(onda10, "Goblin", 0);
        Inimigo g2 = primeiro(onda10, "Goblin", 1);

        int vidaAntes = g2.getAtributos().getVida();
        g1.receberDano(15);
        verificar("04. Dano em um inimigo não afeta outro do mesmo tipo",
                g2.getAtributos().getVida() == vidaAntes && g1.getAtributos().getVida() < vidaAntes,
                "atacar um goblin feriu o outro: eles compartilham o mesmo objeto Atributos?");

        int itensAntes = g2.getInventario().getItens().size();
        g1.adicionarItem("Poção");
        verificar("05. Item adicionado a um inimigo não aparece no inventário de outro",
                g2.getInventario().getItens().size() == itensAntes,
                "os goblins compartilham o mesmo objeto Inventario?");

        int habilidadesAntes = g2.getHabilidades().size();
        g1.aprenderHabilidade(new Habilidade("Fúria", 10, 5));
        verificar("06. Habilidade aprendida por um inimigo não aparece em outro",
                g2.getHabilidades().size() == habilidadesAntes,
                "os goblins compartilham a mesma lista de habilidades?");

        Set<String> posicoes = new HashSet<>();
        for (Inimigo i : onda10) posicoes.add(i.getPosicao().getX() + "," + i.getPosicao().getY());
        verificar("07. Cada inimigo da onda ocupa a sua própria posição",
                posicoes.size() == onda10.size(),
                "só existem " + posicoes.size() + " posições diferentes para " + onda10.size()
                        + " inimigos: eles compartilham o mesmo objeto Posicao?");

        // ---------- Protótipos preservados ----------
        Inimigo novo = primeiro(gerador.gerarOnda(1), "Goblin", 0);
        verificar("08. Um goblin novo nasce intacto, mesmo depois das alterações acima",
                novo.getAtributos().getVida() == 30
                        && novo.getInventario().getItens().size() == 1
                        && novo.getHabilidades().size() == 1,
                "o goblin novo nasceu com " + novo
                        + ". As alterações nos clones vazaram para o protótipo?");

        // ---------- Comportamento do jogo preservado ----------
        List<Inimigo> onda5 = ondas.get(4);
        Inimigo chefe = primeiro(onda5, "Orc Chefe", 0);
        Inimigo arqueiro = primeiro(onda5, "Goblin Arqueiro", 0);
        Inimigo dragao = primeiro(onda5, "Dragão", 0);
        verificar("09. Variantes continuam com os mesmos valores do jogo original",
                chefe != null && chefe.getAtributos().getVidaMaxima() == 200
                        && chefe.getAtributos().getAtaque() == 20 && chefe.getHabilidades().size() == 2
                        && chefe.getInventario().getItens().size() == 2
                        && arqueiro != null && arqueiro.getAtributos().getVidaMaxima() == 25
                        && arqueiro.getHabilidades().size() == 2
                        && dragao != null && dragao.getAtributos().getVidaMaxima() == 600,
                "Orc Chefe, Goblin Arqueiro ou Dragão estão diferentes do jogo original.");

        System.out.println();
        System.out.println("Resultado: " + aprovados + " aprovados, " + reprovados + " reprovados.");
        if (reprovados == 0) System.out.println("Parabéns! Todos os testes passaram.");
    }

    private static void verificar(String descricao, boolean condicao, String dica) {
        if (condicao) {
            aprovados++;
            System.out.println("[ OK ]  " + descricao);
        } else {
            reprovados++;
            System.out.println("[FALHOU] " + descricao);
            System.out.println("         Dica: " + dica);
        }
    }

    private static Inimigo primeiro(List<Inimigo> onda, String nome, int indice) {
        int encontrados = 0;
        for (Inimigo i : onda) {
            if (i.getNome().equals(nome) && encontrados++ == indice) return i;
        }
        return null;
    }

    private static boolean mesmoSpritePorNome(List<Inimigo> onda) {
        for (Inimigo a : onda) {
            for (Inimigo b : onda) {
                if (a.getNome().equals(b.getNome()) && a.getSprite() != b.getSprite()) return false;
            }
        }
        return true;
    }
}
