package Higor_Atividade3;
public class MarcaDagua extends RelatorioDecorator {
    
    public MarcaDagua(IRelatorio relatorio){
        super(relatorio);
    }

    @Override 
    public void gerar(){
        super.gerar();
        System.out.println("===Adicionando marca d'água===");
    }
}
