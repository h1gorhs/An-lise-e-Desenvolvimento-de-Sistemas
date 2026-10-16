package Template_Method_Relembrando;

public class Cafe extends Bebida{
    
    protected void prepararIngrediente(){
        System.out.println("Passando café");
    }

    protected void adicionarComplemento(){
        System.out.println("Colocando açúcar");
    }

}
