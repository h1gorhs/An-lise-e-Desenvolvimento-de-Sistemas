// Strategy concreto
public class FreteParceiro implements IFrete{
    
    public double calcularFrete(double distancia){
        
        return distancia * 0.08;

    }

}
