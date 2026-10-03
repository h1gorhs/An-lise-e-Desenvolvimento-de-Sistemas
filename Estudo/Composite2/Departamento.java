import java.util.List;
import java.util.ArrayList;

public class Departamento implements IComponent {

    private String nome;
    List<IComponent> componentes = new ArrayList();
    
    public Departamento(String nome){
        this.nome = nome;
    }

    public void mostrar(){
        System.out.println("Departamento: " + nome);
        for (IComponent componente : componentes) {
            componente.mostrar();
        }
    }

    public void adicionar(IComponent componente){
        componentes.add(componente);
    }
}