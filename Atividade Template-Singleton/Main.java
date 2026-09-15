public class Main {

    public static void main(String[] args) {

        System.out.println("===LOGIN COM SENHA===");

        ProcessaAutenticacao Login1 = new LoginEmailSenha("higor@gmail.com","unipam");
        
        Login1.ordemProcessamento();

        System.out.println();

        System.out.println("===LOGIN COM AUTENTICAÇÃO DE DOIS FATORES===");

        ProcessaAutenticacao Login2 = new Login2FA("higor@gmail.com","unipam",123);

        Login2.ordemProcessamento();
    }
}