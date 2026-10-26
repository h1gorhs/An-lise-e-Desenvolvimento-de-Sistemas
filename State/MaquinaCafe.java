package State;

public class MaquinaCafe {
    
    private ICafeState pronto;
    private ICafeState servindo;
    private ICafeState preparando;
    private ICafeState estadoAtual;

    public MaquinaCafe(){
        this.pronto = new ProntoState(this);
        this.preparando = new PreparandoState(this);
        this.servindo = new ServindoState(this);
        this.estadoAtual = pronto;
        
    }

    public void setState(ICafeState estado) {
        this.estadoAtual = estado;
    }

    public ICafeState getPronto() {
        return pronto;
    }

    public ICafeState getServindoEstado() {
        return servindo;
    }

    public ICafeState getPreparandoEstado() {
        return preparando;
    }

    public void insereMoeda(){
        this.estadoAtual.insereMoeda();
    }

    public void escolhaCafe(){
        this.estadoAtual.escolhaCafe();
    }

    public void serveCafe(){
        this.estadoAtual.serveCafe();
    }
}
