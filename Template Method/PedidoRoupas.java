class PedidoRoupas extends ProcessaPedido {

    @Override 
     protected void validateOrder() { 
         System.out.println("Validação do pedido de roupas: checando tamanho e disponibilidade."); 
     }

    @Override
    protected void processPayment() {
        System.out.println("Processando pagamento para o pedido de roupas.");
    }

    @Override
    protected void deliverOrder() {
        System.out.println("Entregando pedido de roupas.");
    }
}