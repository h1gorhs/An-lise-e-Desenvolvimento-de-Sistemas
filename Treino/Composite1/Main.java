package Composite1;

public class Main {
    public static void main(String[] args) {
        Arquivo trabalho = new Arquivo("Trabalho.pdf");
        Arquivo foto = new Arquivo("Foto.png");       
        Pasta documentos = new Pasta("Documentos");

        documentos.addComponente(trabalho);
        documentos.addComponente(foto);

        documentos.exibir();
    }
}
