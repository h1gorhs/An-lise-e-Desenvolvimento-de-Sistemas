public class Main {
    public static void main(String[] args) {
        // Processando um pedido de roupas
        ProcessaPedido clothingOrder = new PedidoRoupas();
        System.out.println("Processando pedido de roupas:");
        clothingOrder.processOrder();

        System.out.println();

        // Processando um pedido de eletrônicos
        ProcessaPedido electronicsOrder = new PedidoEletronicos();
        System.out.println("Processando pedido de eletrônicos:");
        electronicsOrder.processOrder();
    }
}