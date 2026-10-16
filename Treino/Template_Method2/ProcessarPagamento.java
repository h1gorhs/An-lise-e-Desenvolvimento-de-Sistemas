package Template_Method2;

public abstract class ProcessarPagamento {
    
    public final void processar(){
        validarPagamento();
        processarPagamento();
        confirmarPagamento();
        enviarComprovante();
    }

    private void validarPagamento(){
        System.out.println("Validando pagamento.");
    }

    protected abstract void processarPagamento();

    private void confirmarPagamento(){
        System.out.println("Confirmando pagamento.");
    }

    private void enviarComprovante(){
        System.out.println("Enviando comprovante.");
    }

}
