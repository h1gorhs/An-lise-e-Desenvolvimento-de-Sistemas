/** CRIADOR CONCRETO: escolhe o e-mail como produto. */
public class NotificadorEmail extends Notificador {
    @Override
    protected Canal criarCanal() {
        return new CanalEmail();//Retorna o produto
    }
}
