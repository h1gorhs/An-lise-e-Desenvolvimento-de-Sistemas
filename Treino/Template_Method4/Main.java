package Template_Method4;

public class Main {
    public static void main(String[] args) {
        PedidoOnline pedido1 = new PedidoOnline();
        PedidoPresencial pedido2 = new PedidoPresencial();
        
        pedido1.processarPedido();

        System.out.println();

        pedido2.processarPedido();
    }
}
