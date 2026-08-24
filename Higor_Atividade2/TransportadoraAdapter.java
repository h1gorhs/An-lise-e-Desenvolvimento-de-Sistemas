/*
 * Adapter: adapta a API externa para a interface ITransportadora usada pelo sistema.
 * Assim, o restante da aplicação não precisa conhecer a interface incompatível.
 */
public class TransportadoraAdapter implements ITransportadora {
    private final TransportadoraExterna transportadoraExterna;
    private final IConverteMilha conversor;
    private final double distanciaPadraoKm;

    public TransportadoraAdapter(TransportadoraExterna transportadoraExterna,
                                 IConverteMilha conversor,
                                 double distanciaPadraoKm) {
        this.transportadoraExterna = transportadoraExterna;
        this.conversor = conversor;
        this.distanciaPadraoKm = distanciaPadraoKm;
    }

    @Override
    public void enviarPedido(Pedido pedido) {
        double distanciaMilhas = conversor.converterMilha(distanciaPadraoKm);
        transportadoraExterna.despachar(pedido.getNumero(), pedido.getCliente(), distanciaMilhas);
    }
}
