public class Main {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido.Builder()
            .setNumero(1)
            .setCliente("Higor")
            .build();

        Pedido pedido2 = new Pedido.Builder()
            .setNumero(2)
            .setCliente("João")
            .setEnderecoEntrega("Rua A, 123")
            .setFormaPagamento("Cartão")
            .setCupomDesconto(10)
            .setObservacao("Entregar peça manhã")
            .build();
        
        System.out.println(pedido1);
        System.out.println(pedido2);
        
    }    
}