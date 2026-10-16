package Template_Method_Relembrando;

public abstract class Bebida {
    
    public final void preparar(){
        ferverAgua();
        prepararIngrediente();    
        colocarNaXicara();
        adicionarComplemento();
    }

    private void ferverAgua(){
        System.out.println("Fervendo água");
    }

    protected abstract void prepararIngrediente();

    private void colocarNaXicara(){
        System.out.println("Colocando na xícara");
    }

    protected abstract void adicionarComplemento();
}
