package Template_Method_Relembrando;

public class Cha extends Bebida{
    
    protected void prepararIngrediente(){
        System.out.println("Colocando o sachê");
    }

    protected void adicionarComplemento(){
        System.out.println("Adicionando mel");
    }
}
