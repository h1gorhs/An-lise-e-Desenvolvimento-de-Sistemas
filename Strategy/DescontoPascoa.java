// Concrete Strategy
public class DescontoPascoa implements IDesconto{

    //Implementar o método abstrato do Strategy (interface)
    @Override
    public double aplicaDesconto(double preco){
        // 10% de desconto
        return preco * 0.90;
    }

}
