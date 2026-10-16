package Composite2;

public class Main {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("Eletrônicos");
        Categoria categoria2 = new Categoria("Acessórios");
        Produto produto1 = new Produto("Notebook", 3000);
        Produto produto2 = new Produto("Mouse", 100);
        Produto produto3 = new Produto("Teclado", 200);
        Produto produto4 = new Produto("Headset", 300);
        
        categoria1.adicionar(produto1);
        categoria1.adicionar(produto2);
        categoria1.adicionar(categoria2);

        categoria2.adicionar(produto3);
        categoria2.adicionar(produto4);
        
        categoria1.mostrar();
        
    }
}
