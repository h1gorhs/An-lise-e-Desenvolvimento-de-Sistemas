package Decorator;

public class Main {
    public static void main(String[] args) {
        
        NotificaApp notificador = new NotificaApp();
        INotifica notificadorDecorado = new NotificaApp();

        notificadorDecorado = new SMSDecorator(notificadorDecorado);
        notificadorDecorado = new TeamsDecorator(notificadorDecorado, "Higor");

        notificadorDecorado.enviar("O banco caiu");
    }
}
