public class Login2FA extends ProcessaAutenticacao {

    private String email;
    private String senha;
    private int codigo;

    public Login2FA(String email, String senha, int codigo) {
        this.email = email;
        this.senha = senha;
        this.codigo = codigo;
    }

    @Override
    protected void loginEtapa1() {
        System.out.println("Digite seu e-mail: " + email);
        System.out.println("Digite sua senha: " + senha);
    }

    @Override
    protected void loginEtapa2() {
        System.out.println("Digite o código de verificação: " + codigo);
    }
}