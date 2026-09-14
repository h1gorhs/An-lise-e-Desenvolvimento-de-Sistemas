public class Login2FA extends ProcessaAutenticacao{
    private String email;
    private String senha;
    private int codigo;

    protected Login2FA(String email, String senha, int codido){
        this.email = email;
        this.senha =  senha;
        this.codigo = codigo;
    }

    @Override 
    protected void loginEtapa1(String email, String senha){
        System.out.println("Digite seu email: " + email);
        System.out.println("Digite sua senha: " + senha);
    }

    @Override 
    protected void loginEtapa2(int codigo){
        System.out.println("Digite o código de verificação: " + codigo);
    }

}