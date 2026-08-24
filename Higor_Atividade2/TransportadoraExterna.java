/*
 * Simula uma API externa que possui uma interface diferente da usada pelo sistema.
 * Ela recebe dados em milhas e não conhece a interface ITransportadora.
 */
public class TransportadoraExterna {
    public void despachar(int codigoPedido, String cliente, double distanciaMilhas) {
        System.out.println("API externa: pedido " + codigoPedido
                + " de " + cliente
                + " despachado por " + distanciaMilhas + " milhas.");
    }
}
