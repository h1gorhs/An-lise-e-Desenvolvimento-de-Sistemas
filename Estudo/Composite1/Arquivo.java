package Composite1;

public class Arquivo implements IComponente{
    
    private String nome;

    public Arquivo(String nome){
        this.nome = nome;
    }

    @Override
    public void mostrar(){
        System.out.println("Arquivo: {" + nome + "}");
    }
}
