// Context do strategy
public class CalculadoraFrete {
    
    private IFrete calculoFrete;

    public CalculadoraFrete(IFrete frete){
        this.calculoFrete = frete;
    }

    public double valorFinal(double precoProduto, double distanciaKm){

        double valorFrete = this.calculoFrete.calcularFrete(distanciaKm);
        return precoProduto+valorFrete;

    }

}
