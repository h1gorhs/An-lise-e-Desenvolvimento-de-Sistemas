// Strategy concreta para cálculo de frete expresso.
public class CalcularDistanciaExpresso implements ICalcularDistancia {
    @Override
    public Double calcularDistancia(Double valor, Double quilometragem) {
        return valor + quilometragem * 1.0;
    }
}
