package Builder1;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro.Builder()
            .setTitulo("Dom Quixote")
            .setAutor("Miguel de Cervantes")
            .setAnoPublicacao(1605)
            .setEditora("Francisco de Roble")
            .build();

        System.out.println(livro);
    }
    
}