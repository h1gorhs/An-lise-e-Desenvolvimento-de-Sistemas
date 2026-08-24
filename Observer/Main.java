package Observer;

public class Main {
    public static void main(String[] args) {

        //Instancia o sujeito
        MonitoramentoMemoria memoria = new MonitoramentoMemoria();

        UsuarioComum user1 = new UsuarioComum("jpalves@unipam.br");
        UsuarioComum user2 = new UsuarioComum("jcsilva@unipam.br");
        UsuarioAdmin useradmin = new UsuarioAdmin("admin@unipam.br");

        //Assina o sujeito
        //memoria.assina(useradmin)
        memoria.assina(useradmin);
        memoria.assina(user1);

        //Alguma alteração ocorre na propriedade de interesse
        memoria.setUsoDeMemoria(51);
    }
}
