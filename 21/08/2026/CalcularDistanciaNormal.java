public class CalcularDistanciaNormal implements ICalcularDistancia{
    //um dos métodos para calcular a distância
    private Double valor;
    private Double quilometragem;

    @Override
    public Double calcularDistancia(Double valor, Double quilometragem){
        return valor = valor + quilometragem * 0.5;
    }
}