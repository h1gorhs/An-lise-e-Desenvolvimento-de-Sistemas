public class Client {
    //class Client
    public static void main(String[] args) {
        Transportadora transporte = new Transportadora();
        
        Double precoEntrega = 50.0;
        Double quilometragem = 1000.0;

        transporte.setEstrategiaCalculo(new CalcularDistanciaPlus());
        System.out.println("O Valor do Transporte é R$" + transporte.getPrecoFinal(precoEntrega, quilometragem));
    }    
}