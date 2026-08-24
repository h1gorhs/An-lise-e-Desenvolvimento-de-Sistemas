// Strategy concreto
public class FreteExpresso implements IFrete{
    
    public double calcularFrete(double distancia){

        return distancia * 0.2;

    }

}
