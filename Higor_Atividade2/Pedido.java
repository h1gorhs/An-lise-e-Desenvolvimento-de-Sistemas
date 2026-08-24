// Representa um pedido do sistema fictício. 
public class Pedido {
    private final int numero;
    private final String cliente;
    private final double valor;

    public Pedido(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getNumero() { return numero; }
    public String getCliente() { return cliente; }
    public double getValor() { return valor; }
}
