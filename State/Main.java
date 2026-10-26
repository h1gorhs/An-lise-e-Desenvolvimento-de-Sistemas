package State;

public class Main {
    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();
        
        maquina.insereMoeda();
        maquina.serveCafe();
        maquina.escolhaCafe();
        maquina.serveCafe();
        
    }
}
