package Observer;

import java.util.ArrayList;
import java.util.List;

public class MonitoramentoMemoria {
    
    private List<ServerObserver> assinantes = new ArrayList<>();
    private double usoDeMemoria;

    public void assina(ServerObserver assinante){
        this.assinantes.add(assinante);
    }

    public void removeAssinante(ServerObserver assinante){
        this.assinantes.remove(assinante);
    }

    //Quando a memória(propriedade de interesse) alterar, também notifica
    public void setUsoDeMemoria(double memoria){
        this.usoDeMemoria = memoria;
        this.notificaAssinantes();
    }

    //Métodos apenas para o sujeito
    private void notificaAssinantes(){
        for(ServerObserver assinante : this.assinantes){
            assinante.update(this.usoDeMemoria);
        }
    }
}
