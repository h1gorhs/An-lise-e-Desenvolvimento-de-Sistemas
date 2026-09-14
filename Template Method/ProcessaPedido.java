// Classe abstrata com o Template Method para processamento de pedidos 
public abstract class ProcessaPedido {

    // Método template definindo o fluxo geral do processamento do pedido

    public final void processOrder() {
        validateOrder();
        processPayment();
        deliverOrder();
        sendNotification();
    }

    // Etapas que podem ser customizadas pelas subclasses
    protected abstract void validateOrder();
    protected abstract void processPayment();
    protected abstract void deliverOrder();

    // Etapa final comum para todas as subclasses
    protected void sendNotification() {
        System.out.println("Notificação enviada ao cliente.");
    }
}