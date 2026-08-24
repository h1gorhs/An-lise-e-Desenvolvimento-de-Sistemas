public class Client {
        public static void main(String[] args) {

                // Singleton: qualquer parte do sistema obtém a mesma configuração.
                Configuracao config1 = Configuracao.getInstancia();
                Configuracao config2 = Configuracao.getInstancia();

                System.out.println("Aplicação: " + config1.getNomeAplicacao());
                System.out.println("Ambiente: " + config1.getAmbiente());
                System.out.println("Singleton funcionando? " + (config1 == config2));

                // Strategy:
                // A Transportadora utiliza uma estratégia de cálculo de frete
                // que pode ser alterada durante a execução.
                Transportadora transportadora = new Transportadora(
                                new CalcularDistanciaNormal());

                Pedido pedido = new Pedido(
                                1001,
                                "Cliente Teste",
                                50.0);

                double quilometragem = 1000.0;

                // Frete Normal
                System.out.println(
                                "Valor do frete Normal: R$"
                                                + transportadora.getPrecoFinal(
                                                                pedido.getValor(),
                                                                quilometragem));

                // Alterando a estratégia para Frete Expresso
                transportadora.setEstrategiaCalculo(
                                new CalcularDistanciaExpresso());

                System.out.println(
                                "Valor do frete Expresso: R$"
                                                + transportadora.getPrecoFinal(
                                                                pedido.getValor(),
                                                                quilometragem));

                // Alterando a estratégia para Frete Grátis
                transportadora.setEstrategiaCalculo(
                                new CalcularDistanciaGratis());

                System.out.println(
                                "Valor do frete Grátis: R$"
                                                + transportadora.getPrecoFinal(
                                                                pedido.getValor(),
                                                                quilometragem));

                // Adapter:
                // O sistema trabalha com ITransportadora,
                // enquanto a API externa possui o método despachar().
                TransportadoraExterna apiExterna = new TransportadoraExterna();

                ITransportadora envio = new TransportadoraAdapter(
                                apiExterna,
                                new ConverteMilha(),
                                quilometragem);

                envio.enviarPedido(pedido);
        }
}