// Implementação da conversão usada pelo Adapter.
public class ConverteMilha implements IConverteMilha {
    @Override
    public double converterMilha(Double quilometragem) {
        return quilometragem * 0.621371;
    }
}
