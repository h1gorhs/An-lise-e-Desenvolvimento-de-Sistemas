// Concrete strategy
public class DescontoNatal implements IDesconto{

    //Implementar o método abstrato do Strategy (interface)
    @Override
    public double aplicaDesconto(double preco){
        // 30% de desconto
        return preco * 0.7;
    }

}
