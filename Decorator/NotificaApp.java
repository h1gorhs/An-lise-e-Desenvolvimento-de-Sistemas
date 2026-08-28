package Decorator;
//Legado
public class NotificaApp implements INotifica {
    
    //Função que será decorada
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando mensagem para a aplicação: " + mensagem);
    }
}
