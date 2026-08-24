package Observer;
//ConcreateObserver
public class UsuarioComum implements ServerObserver {
    
    private String userName;
    
    public UsuarioComum(String nome){
        this.userName = nome;
    }

    @Override
    public void update(double usoDeMemoria){

        if (usoDeMemoria>80) {
            System.out.println("Notificando o usuário " + this.userName + " uso de memória ultrapassou 80%!!!");
        }
    }
}
