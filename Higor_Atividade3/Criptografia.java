package Higor_Atividade3;
public class Criptografia extends RelatorioDecorator {
    
    public Criptografia(IRelatorio relatorio){
        super(relatorio);
    }

    @Override 
    public void gerar(){
        super.gerar();
        System.out.println("===Criptografando relatório===");
    }
}
