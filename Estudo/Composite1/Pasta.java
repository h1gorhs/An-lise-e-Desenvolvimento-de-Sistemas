package Composite1;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements IComponente {
    
    private String nome;
    List<IComponente> arquivos = new ArrayList<>();

    public Pasta(String nome){
        this.nome = nome;
    }

    @Override
    public void mostrar(){
        System.out.println("Pasta: {" + nome + "}");
        for (IComponente componente : arquivos) {
            componente.mostrar();
        }
    }

    public void adicionar(IComponente componente){
        arquivos.add(componente);
    }
}
