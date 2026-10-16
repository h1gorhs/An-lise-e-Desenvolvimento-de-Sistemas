package Template_Method2;

public class Cartao extends ProcessarPagamento{
    
    @Override 
    protected void processarPagamento(){
        System.out.println("Processando pagamento via cartão.");
    }

}
