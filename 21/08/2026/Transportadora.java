public class Transportadora{
    //class context
    private ICalcularDistancia estrategiaCalculo;

    private IConverteMilha estrategiaMilha;

    public void setEstrategiaCalculo(ICalcularDistancia estrategia){
        this.estrategiaCalculo = estrategia;
    }

    public Double getPrecoFinal(Double preco, Double quilometragem){
        return estrategiaCalculo.calcularDistancia(preco, quilometragem);
    }

    public void setEstrategiaMilha(ICalcula)
}