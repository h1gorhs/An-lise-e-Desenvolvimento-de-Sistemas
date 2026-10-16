package Template_Method1;

public class Cafe extends Bebida{
    
    @Override 
    protected void prepararIngredientes(){
        System.out.println("Passando o café.");
    }

    @Override 
    protected void adicionarComplemento(){
        System.out.println("Adicionando açúcar.");
    }
}
