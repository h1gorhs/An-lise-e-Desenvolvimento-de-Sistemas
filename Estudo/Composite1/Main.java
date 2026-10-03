package Composite1;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("atividade.pdf");
        Arquivo arquivo2 = new Arquivo("trabalho.docx");
        Arquivo arquivo3 = new Arquivo("foto.jpg");
        Pasta pasta1 = new Pasta("Computador");
        Pasta pasta2 = new Pasta("Documentos");

        pasta1.adicionar(arquivo3);
        pasta1.adicionar(pasta2);
        pasta2.adicionar(arquivo1);
        pasta2.adicionar(arquivo2);

        pasta1.mostrar();
    }
}
