public class Main {

    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Empresa");
        Funcionario func1 = new Funcionario("João", "Gerente");
        Funcionario func2 = new Funcionario("Maria", "RH");

        Departamento dep2 = new Departamento("TI");
        Funcionario func3 = new Funcionario("Carlos", "Desenvolvedor");
        Funcionario func4 = new Funcionario("Pedro", "Analista");

        Departamento dep3 = new Departamento("Backend");
        Funcionario func5 = new Funcionario("Lucas", "Desenvolvedor");
        Funcionario func6 = new Funcionario("Ana", "Desenvolvedora");
        
        dep1.adicionar(func1);
        dep1.adicionar(func2);
        dep1.adicionar(dep2);

        dep2.adicionar(func3);
        dep2.adicionar(func4);
        dep2.adicionar(dep3);
        
        dep3.adicionar(func5);
        dep3.adicionar(func6);

        dep1.mostrar();
    }    
}