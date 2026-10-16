package Composite1;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Componente {

    private String nome;

    public List<Componente> arquivos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addComponente(Componente componente) {
        arquivos.add(componente);
    }

    @Override
    public void exibir() {
        System.out.println("Pasta: [ " + nome + " ]");
            
        for (Componente componente : arquivos) {
            componente.exibir();
        }
    }
    
}
