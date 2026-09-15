public class SessaoUsuario {
    //Classe Singleton
    private static SessaoUsuario instancia;

    private SessaoUsuario(){
        System.out.println("===Nova sessão criada===");
    }

    public static  SessaoUsuario getInstancia(){
        if (instancia == null) {
            instancia = new SessaoUsuario();    
        }

        return  instancia;
    }

    public void iniciarSessao(){
        System.out.println("===Sessão do usuário iniciada===");
    }
}
