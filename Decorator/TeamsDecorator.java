package Decorator;

public class TeamsDecorator extends NotificaDecorator {
    
    private String user;

    public TeamsDecorator(INotifica notificador, String user){
        super(notificador);
        this.user = user;
    }

    @Override
    public void enviar(String mensagem){
        super.enviar(mensagem);//Ainda chama função legado
        
        System.out.println("Autenticar usuário " + this.user);
        System.out.println("Conecta com a API...");
        System.out.println("Enviando notificação via MS Teams: " + mensagem);
    }
}
