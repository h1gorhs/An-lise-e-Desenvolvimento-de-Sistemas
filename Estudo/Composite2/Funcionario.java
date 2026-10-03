public class Funcionario implements IComponent{

    private String nome;
    private String cargo;
    
    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override 
    public void mostrar(){
        System.out.println("Funcionário: " + nome + " - " + cargo);
    }
}