package Higor_Atividade3;
public abstract class RelatorioDecorator implements IRelatorio {

    protected IRelatorio relatorio;

    public RelatorioDecorator(IRelatorio relatorio){
        this.relatorio = relatorio;
    }

    @Override 
    public void gerar(){
        relatorio.gerar();
    }
}
