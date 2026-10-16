package Composite1;

public class Arquivo implements Componente {
    
    private String nome;

    public Arquivo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    

    @Override 
    public void exibir(){
        System.out.println("    ARQUIVO: [ " + nome + " ]");
    }

}
