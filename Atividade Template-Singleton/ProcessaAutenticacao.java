public abstract class ProcessaAutenticacao {

    public final void ordemProcessamento(){
        loginEtapa1();
        loginEtapa2();
        confirmaLogin();
    }

    protected  abstract void loginEtapa1();
    protected  abstract void loginEtapa2();

    protected  void confirmaLogin(){
        System.out.println("Login realizado com sucesso!");
    }
}