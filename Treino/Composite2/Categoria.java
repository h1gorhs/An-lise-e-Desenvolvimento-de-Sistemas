package Composite2;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements IComponente {
    
    private String nome;
    public List<IComponente> componentes = new ArrayList<>();

    public Categoria(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionar(IComponente componente){
        componentes.add(componente);
    }

    @Override 
    public void mostrar(){
        System.out.println("CATEGORIA: {" + nome + "- R$" + calcularPreco() + "}");
        for (IComponente componente : componentes) {
            componente.mostrar();
        }
    }

    @Override 
    public double calcularPreco(){
        double soma = 0;
        for (IComponente componente : componentes) {
            soma += componente.calcularPreco();
        }

        return soma;

    }
}
