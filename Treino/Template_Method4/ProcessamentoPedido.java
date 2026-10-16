package Template_Method4;

public abstract class ProcessamentoPedido {
    
    public final void processarPedido(){
        validarPedido();
        calcularFrete();
        processarPagamento();
        separarProdutos();
        finalizarPedido();
    }

    private void validarPedido(){
        System.out.println("Validando pedido.");
    }

    protected abstract void calcularFrete();

    protected abstract void processarPagamento();

    private void separarProdutos(){
        System.out.println("Separando produtos.");
    }

    private void finalizarPedido(){
        System.out.println("Finalizando pedidos.");
    }
}
