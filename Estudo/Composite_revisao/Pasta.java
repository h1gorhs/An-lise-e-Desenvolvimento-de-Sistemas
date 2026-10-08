package Composite_revisao;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements IComponente{
    
    private String nome;
    public List<IComponente> componentes = new ArrayList<>();

    public Pasta(String nome){
        this.nome = nome;
    }

    public void adicionar(IComponente componente){
        componentes.add(componente);
    }

    @Override 
    public void mostrar(){
        System.out.println("Pasta: {" + nome + "}");
        for (IComponente componente : componentes) {
            componente.mostrar();
        }
    }

}
