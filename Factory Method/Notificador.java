/**
 * CRIADOR (Creator).
 * Contém a regra de negócio de notificação, escrita UMA única vez.
 * Não sabe qual canal concreto será usado: delega essa decisão
 * às subclasses por meio do factory method criarCanal().
 */
public abstract class Notificador {

    /** O FACTORY METHOD: cada subclasse decide qual Canal criar. */
    protected abstract Canal criarCanal();

    /** Regra de negócio que USA o produto sem conhecer sua classe concreta. */
    public void notificar(String destino, String mensagem) {
        if (destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("Destino obrigatório");
        }
        /* Você vai implementar várias regras de negócio aqui... */
        
        Canal canal = criarCanal(); // PONTO IMPORTANTE: Aqui a subclasse implementa e intancia.
        canal.enviar(destino, mensagem);
        registrarEnvio(canal, destino);
    }

    private void registrarEnvio(Canal canal, String destino) {
        System.out.println("   log: enviado para " + destino
                + " via " + canal.getClass().getSimpleName());
    }
}
