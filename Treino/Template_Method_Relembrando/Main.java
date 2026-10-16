package Template_Method_Relembrando;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Cha cha = new Cha();
        
        cafe.preparar();

        System.out.println();

        cha.preparar();
    }
    
}