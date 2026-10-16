package Template_Method5;

public class Email extends Notificacao{
    
    @Override 
    protected void prepararMensagem(){
        System.out.println("Preparando mensagem de e-mail.");
    }

    @Override 
    protected void verificarDestinatario(){
        System.out.println("Verificando endereço de e-mail.");
    }

    @Override 
    protected void adicionarAssinatura(){
        System.out.println("Adicionando assinatura do e-mail.");
    }
}
