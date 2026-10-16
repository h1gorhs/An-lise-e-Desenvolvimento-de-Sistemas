package Composite_Relembrando;

public class Main {
    public static void main(String[] args) {
        Pasta pasta1 = new Pasta("Computador");
        Pasta pasta2 = new Pasta("Documentos");
        Arquivo arquivo1 = new Arquivo("foto.png");
        Arquivo arquivo2 = new Arquivo("trabalho.pdf");
        Arquivo arquivo3 = new Arquivo("atividade.docx");
        
        pasta1.adicionar(arquivo1);
        pasta1.adicionar(pasta2);

        pasta2.adicionar(arquivo2);
        pasta2.adicionar(arquivo3);
        
        pasta1.mostrar();

    }
}
