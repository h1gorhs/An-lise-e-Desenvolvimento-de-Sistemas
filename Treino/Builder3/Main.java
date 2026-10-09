package Builder3;

public class Main {
    public static void main(String[] args) {
        //Produto prod1 = new Produto.Builder()
        //    .setCategoria("Eletrônicos")
        //    .build();
        
        //Produto prod2 = new Produto.Builder()
        //    .setNone("mouse")
        //    .build();

        Produto prod3 = new Produto.Builder()
            .setNone("teclado")
            .setPreco(150.00)
            .setCategoria("Periféricos")
            .setDescricao("Teclado Gamer")
            .setEstoque(15)
            .build();
        
        //System.out.println(prod1);
        //System.out.println(prod2);
        System.out.println(prod3);
    }
}
