package Template_Method4;

public class PedidoOnline extends ProcessamentoPedido{
    
    @Override 
    protected void calcularFrete(){
        System.out.println("Calculando frete para entrega.");
    }

    @Override 
    protected void processarPagamento(){
        System.out.println("Processando pagamento online.");
    }
}
