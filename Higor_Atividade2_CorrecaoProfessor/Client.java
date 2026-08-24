public class Client {
    public static void main(String[] args) {
        
        // Pegando o nome da aplicação

        // ConfigApp config = new ConfigApp(); // Não é possível instanciar
        // Instância única
        ConfigApp app = ConfigApp.getConfiguracao();
        System.out.println(app.getName());

        // Definindo estratégia de Frete em tempo de execução
        double valorProduto = 100;
        double distanciaKm = 150;

        CalculadoraFrete frete = new CalculadoraFrete(new FreteParceiro());
        double valorfinal = frete.valorFinal(valorProduto, distanciaKm);
        System.out.println("Valor final da compra com frete: "+ valorfinal);

        // Envio de pedido adaptado
        EnvioAdaptado envio = new EnvioAdaptado();
        // Seguro não é obrigatório
        envio.enviarPedido(4, valorfinal);
        // Seguro obrigatório
        envio.enviarPedido(5, valorfinal);
    }
}
