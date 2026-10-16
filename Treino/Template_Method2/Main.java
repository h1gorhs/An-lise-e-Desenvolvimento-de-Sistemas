package Template_Method2;

public class Main {
    public static void main(String[] args) {
        Pix pix = new Pix();
        Cartao cartao = new Cartao();
        
        pix.processar();

        System.out.println();

        cartao.processar();
    }
}
