package Template_Method5;

public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        SMS sms = new SMS();
        
        email.enviarNotificacao();

        System.out.println();

        sms.enviarNotificacao();
    }
}
