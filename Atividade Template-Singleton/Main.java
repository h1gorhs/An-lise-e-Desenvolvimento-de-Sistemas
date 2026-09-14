public class Main {

    public static void main(String[] args) {
        LoginEmailSenha logins = new LoginEmailSenha("higor@gmail","123");

        ProcessaAutenticacao Login1 = new LoginEmailSenha("higor@gmail", "123");
        System.out.println("Preparando para entrar");
        Login1.ordemProcessamento();
    }    
}