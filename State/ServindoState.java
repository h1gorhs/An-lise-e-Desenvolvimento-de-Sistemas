package State;

public class ServindoState implements ICafeState{

    private MaquinaCafe maquina;
    
    public ServindoState(MaquinaCafe maquina){
        this.maquina = maquina;
    }

    @Override 
    public void insereMoeda(){
        System.out.println("Café pronto, sirva primeiro e depois insira a moeda.");
    }

    @Override 
    public void escolhaCafe(){
        System.out.println("Café pronto. Rerire da máquina primeiro.");
    }

    @Override 
    public void serveCafe(){
        System.out.println("Café servido. Máquina pronta para o próximo pedido.");
        this.maquina.setState(new ProntoState(this.maquina));
    }    
    
}
