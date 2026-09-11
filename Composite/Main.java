package Composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent pasta1 = new Pasta("Pasta 1");
        FileSystemComponent pasta2 = new Pasta("Pasta 2");

        FileSystemComponent arquivo1 = new Arquivo("Main.java", 25);
        FileSystemComponent arquivo2 = new Arquivo("Planilha.csv", 12);
        FileSystemComponent arquivo3 = new Arquivo("Senha.txt", 44);

        pasta1.add(arquivo1);
        pasta1.add(arquivo2);
        pasta2.add(arquivo3);
        pasta1.add(pasta2);

        arquivo1.display("");
    }
}
