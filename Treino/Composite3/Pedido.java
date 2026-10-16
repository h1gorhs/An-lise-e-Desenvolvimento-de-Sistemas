package Composite3;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements IComponente{
    
    private int numero;
    public List<IComponente> componentes = new ArrayList<>();

    public Pedido(int numero){
        this.numero = numero;
    }

    public void adicionar(IComponente componente){
        componentes.add(componente);
    }

    @Override 
    public double calcularTotal(){
        double soma = 0;
        for (IComponente componente : componentes) {
            soma += componente.calcularTotal();
        }
        return soma;
    }

    @Override 
    public void mostrar(){
        System.out.println("Pedido: {" + numero + "}");
        for (IComponente componente : componentes) {
            componente.mostrar();
        }
        System.out.println("Total do Pedido: " + numero + " R$" + calcularTotal());
    }
}
