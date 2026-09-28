/** CRIADOR CONCRETO: escolhe o SMS como produto. */
public class NotificadorSms extends Notificador {
    @Override
    protected Canal criarCanal() {
        return new CanalSms();
    }
}
