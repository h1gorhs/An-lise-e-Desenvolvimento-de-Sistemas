// Context
public class Carrinho {

    // É a associação com o componente Strategy
    private IDesconto estrategiaDesconto;
    
    // Set da estratégia
    public void defineDesconto(IDesconto tipoDesconto){
        this.estrategiaDesconto = tipoDesconto;
    }

    public double getPrecoFinal(double preco){
        return this.estrategiaDesconto.aplicaDesconto(preco);
    }

}
