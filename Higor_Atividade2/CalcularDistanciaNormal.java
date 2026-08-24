// Strategy concreta para cálculo de frete normal.
public class CalcularDistanciaNormal implements ICalcularDistancia {
    @Override
    public Double calcularDistancia(Double valor, Double quilometragem) {
        return valor + quilometragem * 0.5;
    }
}
