package Template_Method5;

public abstract class Notificacao {
    
    public final void enviarNotificacao(){
        prepararMensagem();
        verificarDestinatario();
        adicionarAssinatura();
        enviar();
    }

    protected abstract void prepararMensagem();

    protected abstract void verificarDestinatario();

    protected void adicionarAssinatura(){
        System.out.println("Nenhuma assinatura adicionada.");
    }

    private void enviar(){
        System.out.println("Enviando.");
    }
}
