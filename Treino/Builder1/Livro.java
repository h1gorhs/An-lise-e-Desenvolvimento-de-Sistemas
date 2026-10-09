package Builder1;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;    
    private String editora;

    private Livro(Builder builder){
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.anoPublicacao = builder.anoPublicacao;
        this.editora = builder.editora;
    }

    @Override 
    public String toString(){
        return "Livro: { \n" +
        "   Titulo: " + titulo + "\n" +
        "   Autor: " + autor + "\n" +
        "   Ano de Publicação: " + anoPublicacao + "\n" +
        "   Editora: " + editora + "\n}\n";
    }

    public static class Builder {
    
        private String titulo;
        private String autor;
        private int anoPublicacao;
        private String editora;

        public Builder setTitulo(String titulo){
            this.titulo = titulo;
            return this;
        }

        public Builder setAutor(String autor){
            this.autor = autor;
            return this;
        }

        public Builder setAnoPublicacao(int anoPublicacao){
            this.anoPublicacao = anoPublicacao;
            return this;
        }

        public Builder setEditora(String editora){
            this.editora = editora;
            return this;
        }

        public Livro build(){
            return new Livro(this);
        }
    }
}