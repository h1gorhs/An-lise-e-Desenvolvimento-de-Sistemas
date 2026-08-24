// Classe adaptada/legada
// Espera receber o formato .csv ou .xlsx
public class ExcellFormatter{

    public void formataColunas(){
        System.out.println("Col A | "+"Col B | "+"Col C " );
    }

    public void formataLinhas(){
        System.out.println("Formatando linhas...");
        System.out.println("Removendo registros nulos");
    }

    public void formataEstilo(){
        System.out.println("Formatando estilo...");
        System.out.println("Fonte: Times New Roman");
        System.out.println("Tamanho: 12");
    }

    public void executaFormatacao(){
        this.formataColunas();
        this.formataLinhas();
        this.formataEstilo();
    }

}