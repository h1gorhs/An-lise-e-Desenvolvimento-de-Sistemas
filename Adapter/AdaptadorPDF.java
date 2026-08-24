public class AdaptadorPDF implements IFormatadorAdapter{
    
    // Associação com código legado
    private ExcellFormatter formatadorPlanilhas;

    public AdaptadorPDF(ExcellFormatter formatadorPlanilhas){
        this.formatadorPlanilhas = formatadorPlanilhas;
    }

    @Override
    public void execucaoAdaptada(){
        //Adaptação acontece aqui
        System.out.println("Lendo o PDF");
        System.out.println("Buscar planilhas no PDF");
        System.out.println("if len(planilha)<1: então return null");
        System.out.println("else: retorna a planilha");

        //Delega restante da execução para o código legado
        this.formatadorPlanilhas.executaFormatacao();

    }

}
