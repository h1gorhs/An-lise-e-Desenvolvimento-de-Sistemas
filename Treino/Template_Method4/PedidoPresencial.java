package Template_Method4;

public class PedidoPresencial extends ProcessamentoPedido{
    
    @Override 
    protected void calcularFrete(){
        System.out.println("Calculando frete: R$0,00.");
    }

    @Override 
    protected void processarPagamento(){
        System.out.println("Processando pagamento no caixa.");
    }
}
