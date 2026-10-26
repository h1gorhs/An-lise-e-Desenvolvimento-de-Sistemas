package State;

public class PreparandoState implements ICafeState{
    //É o objeto máquina. Mudamos o seu estado acessando essa referência.
    private MaquinaCafe maquina;
    
    public PreparandoState(MaquinaCafe maquina){
        this.maquina = maquina;
    }

    @Override 
    public void insereMoeda(){
        System.out.println("A moeda já foi inserida. O café está sendo preparado. Aguarde.");
        this.maquina.setState(maquina.getPreparandoEstado());
    }

    @Override 
    public void escolhaCafe(){
        System.out.println("Café sendo preparado...");
        this.maquina.setState(new ProntoState(maquina));
    }

    @Override 
    public void serveCafe(){
        System.out.println("Café ainda não foi preparado...");
    }
}
