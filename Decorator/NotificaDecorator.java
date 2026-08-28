package Decorator;
//Objeto decorador
public abstract class NotificaDecorator implements INotifica {
    
    INotifica notificador;//referência ao decorador concreto(quem vai modificar a função)

    public NotificaDecorator(INotifica notificador){
        this.notificador = notificador;
    }

    public void enviar(String mensagem){
        this.notificador.enviar(mensagem);
    }
}
