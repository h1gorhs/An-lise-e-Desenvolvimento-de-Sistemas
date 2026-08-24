//Client
public class Main {
    public static void main(String[] args) {
        
        AdaptadorPDF adaptador = new AdaptadorPDF(new ExcellFormatter());

        adaptador.execucaoAdaptada();

    }
}
