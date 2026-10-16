package Composite3;

public class Produto implements IComponente{
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override 
    public double calcularTotal(){
        return quantidade * preco;
    }

    @Override 
    public void mostrar(){
        System.out.println("Produto: {" + nome + " - Valor: R$" + preco + " - Quantidade: " + quantidade +" - Valor Total: R$" + calcularTotal() +"}");
    }
}
