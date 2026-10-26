import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/** Simula as 10 primeiras ondas do jogo e mede o tempo de cada uma. */
public class Jogo {

    public static void main(String[] args) {
        System.out.println("=== Defensores do Reino ===\n");
        long inicioTotal = System.nanoTime();
        GeradorDeOnda gerador = new GeradorDeOnda();
        Set<Sprite> spritesEmMemoria = Collections.newSetFromMap(new IdentityHashMap<>());
        int totalInimigos = 0;

        for (int numero = 1; numero <= 10; numero++) {
            long inicio = System.nanoTime();
            List<Inimigo> onda = gerador.gerarOnda(numero);
            long ms = (System.nanoTime() - inicio) / 1_000_000;

            totalInimigos += onda.size();
            for (Inimigo i : onda) spritesEmMemoria.add(i.getSprite());
            System.out.printf("Onda %2d: %2d inimigos preparados em %5d ms%n", numero, onda.size(), ms);

            if (numero == 5) {
                System.out.println("         Chefes da onda 5:");
                for (Inimigo i : onda) {
                    if (i.getNome().equals("Orc Chefe") || i.getNome().equals("Dragão")) {
                        System.out.println("           " + i);
                    }
                }
            }
        }

        long msTotal = (System.nanoTime() - inicioTotal) / 1_000_000;
        int kb = spritesEmMemoria.stream().mapToInt(Sprite::tamanhoEmBytes).sum() / 1024;
        System.out.println();
        System.out.println("Inimigos criados ........ " + totalInimigos);
        System.out.println("Tempo total ............. " + msTotal + " ms");
        System.out.println("Sprites lidos do disco .. " + CarregadorDeRecursos.totalDeCarregamentos());
        System.out.println("Sprites em memória ...... " + spritesEmMemoria.size() + " objetos (" + kb + " KB)");
    }
}
