package Composite3;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);
        Produto produto1 = new Produto("Mouse", 100, 50);
        Produto produto2 = new Produto("Teclado", 200, 15);
        Produto produto3 = new Produto("Headset", 300, 20);
        Produto produto4 = new Produto("Notebook", 3000, 10);
        
        pedido1.adicionar(produto1);
        pedido1.adicionar(produto2);
        pedido1.adicionar(pedido2);

        pedido2.adicionar(produto3);
        pedido2.adicionar(produto4);

        pedido1.mostrar();
        
    }
}
