package Higor_Atividade3;
public class Compactacao extends RelatorioDecorator{
    
    public Compactacao(IRelatorio relatorio){
        super(relatorio);
    }

    @Override 
    public void gerar(){
        super.gerar();
        System.out.println("===Compactando relatório===");
    }
}
