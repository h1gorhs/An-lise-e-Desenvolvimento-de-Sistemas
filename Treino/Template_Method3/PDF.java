package Template_Method3;

public class PDF extends Relatorio{
    
    @Override 
    protected void gerarCabecalho(){
        System.out.println("Gerando cabeçalho PDF.");
    }

    @Override 
    protected void gerarDados(){
        System.out.println("Gerando dados PDF.");
    }

    @Override 
    protected void gerarRodape(){
        System.out.println("Gerando rodapé PDF.");
    }
}
