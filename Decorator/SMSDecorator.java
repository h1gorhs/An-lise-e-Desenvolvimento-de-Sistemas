package Decorator;

public class SMSDecorator extends NotificaDecorator{

    public SMSDecorator(INotifica notificador){
        super(notificador);
    }

    public void preparaMensagemSMS(){
        System.out.println("Formatando para padrão SMS");
        System.out.println("Conectando com API...");
    }

    public void enviar(String mensagem){
        super.enviar(mensagem);//Também envia mensagem via aplicação

        this.preparaMensagemSMS();//Prepara a mensagem antes de enviar
        System.out.println("Enviando mensagem via SMS: " + mensagem);
    }


} 