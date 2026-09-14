class PedidoEletronicos extends ProcessaPedido {

    @Override 
     protected void validateOrder() { 
         System.out.println("Validação do pedido de eletrônicos: checando restrições de envio e inventário."); 
     }

    @Override
    protected void processPayment() {
        System.out.println("Processando pagamento para o pedido de eletrônicos.");
    }

    @Override 
     protected void deliverOrder() { 
       System.out.println("Entregando pedido de eletrônicos com embalagem extra para proteção."); 
     }
}