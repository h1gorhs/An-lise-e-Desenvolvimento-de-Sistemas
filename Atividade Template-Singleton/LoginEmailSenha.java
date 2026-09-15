public class LoginEmailSenha extends ProcessaAutenticacao {

    private String email;
    private String senha;

    public LoginEmailSenha(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    protected void loginEtapa1() {
        System.out.println("Digite seu e-mail: " + email);
    }

    @Override
    protected void loginEtapa2() {
        System.out.println("Digite sua senha: " + senha);
    }
}