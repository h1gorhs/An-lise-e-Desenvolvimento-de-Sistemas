package Template_Method2;

public class Pix extends ProcessarPagamento{
    
    @Override 
    protected void processarPagamento(){
        System.out.println("Processando pagamento via Pix.");
    }
}
