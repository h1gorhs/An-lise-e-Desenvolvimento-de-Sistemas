/*
 * Contexto do Strategy e interface que o restante do sistema utiliza.
 * O cálculo pode ser trocado sem alterar a classe.
 */
public class Transportadora {
    private ICalcularDistancia estrategiaCalculo;

    public Transportadora(ICalcularDistancia estrategiaCalculo) {
        this.estrategiaCalculo = estrategiaCalculo;
    }

    public void setEstrategiaCalculo(ICalcularDistancia estrategia) {
        this.estrategiaCalculo = estrategia;
    }

    public Double getPrecoFinal(Double preco, Double quilometragem) {
        if (estrategiaCalculo == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete foi definida.");
        }
        return estrategiaCalculo.calcularDistancia(preco, quilometragem);
    }
}
