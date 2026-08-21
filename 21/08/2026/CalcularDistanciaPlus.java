public class CalcularDistanciaPlus implements ICalcularDistancia {
    //um dos métodos para calcular a distância
    private Double valor;
    private Double quilometragem;

    @Override
    public Double calcularDistancia(Double valor, Double quilometragem){
        return valor = valor + quilometragem * 2.0;
    }    
}