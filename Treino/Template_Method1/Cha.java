package Template_Method1;

public class Cha extends Bebida {
    
    @Override 
    protected void prepararIngredientes(){
        System.out.println("Colocando o sachê de chá.");
    }

    @Override 
    protected void adicionarComplemento(){
        System.out.println("Adicionando mel.");
    }
}
