/**
 * PRODUTO (Product).
 * A única abstração de "canal" que o resto do sistema conhece.
 */
public interface Canal {
    void enviar(String destino, String mensagem);
}
