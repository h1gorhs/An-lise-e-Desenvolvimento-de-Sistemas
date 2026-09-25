package Higor_Atividade3;
public class AssinaturaDigital extends RelatorioDecorator {
    
    public AssinaturaDigital(IRelatorio relatorio){
        super(relatorio);
    }

    @Override 
    public void gerar(){
        super.gerar();
        System.out.println("===Assinando Digitalmente===");
    }
}
