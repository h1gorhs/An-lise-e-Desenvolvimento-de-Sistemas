package Builder_Relembrando2;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro.Builder()            
            .setTitulo("Dom Quixote")
            .setAutor("Miguel de Cervantes")
            .setAnoPublicacao(1605)
            .setEditora("Francisco de Noble ")
            .build();
        

        System.out.println(livro1); 


    }
}
