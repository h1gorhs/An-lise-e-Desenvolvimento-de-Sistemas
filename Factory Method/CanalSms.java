/** PRODUTO CONCRETO: envia por SMS. */
public class CanalSms implements Canal {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[SMS] Para " + destino + ": " + mensagem);
    }
}
