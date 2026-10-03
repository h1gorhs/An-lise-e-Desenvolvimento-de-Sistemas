public class Main {
    
    public static void main(String[] args) {
        
        Caractere c1 = new Caractere('A', 1, 1, 
            FormatacaoFabrica.geFormatacao("Arial", 12, "Negrito"));
        Caractere c2 = new Caractere('B', 1, 2, 
            FormatacaoFabrica.geFormatacao("Arial", 12, "Negrito"));
        Caractere c3 = new Caractere('C', 1, 3, 
            FormatacaoFabrica.geFormatacao("Arial", 12, "Negrito"));
        Caractere c4 = new Caractere('D', 1, 4, 
            FormatacaoFabrica.geFormatacao("Calibri", 12, "Negrito"));

        c1.exibir();
        c2.exibir();
        c3.exibir();
        c4.exibir();

        System.out.println("Existem " + FormatacaoFabrica.lenLista() + " objetos do tipo Formatacao compartilhados");
    }

}
