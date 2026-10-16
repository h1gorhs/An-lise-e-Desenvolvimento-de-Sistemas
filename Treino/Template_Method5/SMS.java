package Template_Method5;

public class SMS extends Notificacao{
    
    @Override 
    protected void prepararMensagem(){
        System.out.println("Preparando mensagem SMS.");
    }

    @Override 
    protected void verificarDestinatario(){
        System.out.println("Verificando número de telefone.");
    }
}
