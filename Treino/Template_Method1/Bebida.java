package Template_Method1;

public abstract class Bebida {
    
    public final void preparar(){
        ferverAgua();
        prepararIngredientes();
        colocarNaXicara();
        adicionarComplemento();
    }

    private void ferverAgua(){
        System.out.println("A água está sendo fervida.");
    }

    protected abstract void prepararIngredientes();

    private void colocarNaXicara(){
        System.out.println("Colocando na xícara.");
    }

    protected abstract void adicionarComplemento();
}
