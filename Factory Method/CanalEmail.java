/** PRODUTO CONCRETO: envia por e-mail. */
public class CanalEmail implements Canal {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[E-MAIL] Para " + destino + ": " + mensagem);
    }
}
