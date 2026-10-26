package State;

public class ProntoState implements ICafeState{

    private MaquinaCafe maquina;
    
    public ProntoState(MaquinaCafe maquina){
        this.maquina = maquina;
    }

    @Override 
    public void insereMoeda(){
        System.out.println("Moeda inserida. Selecione o café.");
        this.maquina.setState(maquina.getPreparandoEstado());
    }

    @Override 
    public void escolhaCafe(){
        System.out.println("Insira a moeda primeiro.");
    }

    @Override 
    public void serveCafe(){
        System.out.println("Café ainda não foi preparado.");
    }
}
