public class LoginEmailSenha extends ProcessaAutenticacao {
    private String email;
    private String senha;

    protected LoginEmailSenha(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    @Override 
    protected void loginEtapa1(String email){
        System.out.println("Digite seu e-mail: " + email);
    }

    @Override 
    protected  void loginEtapa2(String senha){
        System.out.println("Digite sua senha: " + senha);
    }
    
}