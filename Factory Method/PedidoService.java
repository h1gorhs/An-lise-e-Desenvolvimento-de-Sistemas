/**
 * CLIENTE: um serviço de negócio.
 * O serviço depende apenas da abstração Notificador.
 */
public class PedidoService {
    private final Notificador notificador;

    public PedidoService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void confirmar(String cliente, String numeroPedido) {
        // ... regras do pedido ...
        notificador.notificar(cliente, "Pedido " + numeroPedido + " confirmado!");
    }
}
