public class App {
    public static void main(String[] args) {
        // A escolha concreta acontece UMA vez, na configuração da aplicação.
        Notificador porEmail = new NotificadorEmail();
        Notificador porSms   = new NotificadorSms();

        // Daqui em diante, o código só conhece Notificador e Canal.
        new PedidoService(porEmail).confirmar("maria@exemplo.com", "1001");
        new PedidoService(porSms).confirmar("(11) 99999-0000", "1002");
    }
}
