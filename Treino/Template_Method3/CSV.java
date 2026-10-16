package Template_Method3;

public class CSV extends Relatorio{
    
    @Override 
    protected void gerarCabecalho(){
        System.out.println("Gerando cabeçalho CSV.");
    }

    @Override 
    protected void gerarDados(){
        System.out.println("Gerando dados CSV.");
    }

    @Override 
    protected void gerarRodape(){
        System.out.println("Gerando rodapé CSV.");
    }

}
