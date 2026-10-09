package Builder3;

public class Produto {

    private String nome;
    private double preco;
    private String categoria;
    private String descricao;
    private int estoque;

    private Produto(Builder builder){
        this.nome = builder.nome;
        this.preco = builder.preco;
        this.categoria = builder.categoria;
        this.descricao = builder.descricao;
        this.estoque = builder.estoque;
    }

    @Override 
    public String toString(){
        return "Produto {\n" +
        "   Nome: " + nome + "\n" +
        "   Preco: R$" + preco + "\n" +
        "   Categoria: " + categoria + "\n" +
        "   Descrição: " + descricao + "\n" +
        "   Estoque: " + estoque + "\n}\n";
    }

    public static class Builder {
    
        private String nome;
        private double preco;
        private String categoria;
        private String descricao;
        private int estoque;

        public Builder setNone(String nome){
            this.nome = nome;
            return this;
        }

        public Builder setPreco(double preco){
            this.preco = preco;
            return this;
        }

        public Builder setCategoria(String categoria){
            this.categoria = categoria;
            return this;
        }

        public Builder setDescricao(String descricao){
            this.descricao = descricao;
            return this;
        }

        public Builder setEstoque(int estoque){
            this.estoque = estoque;
            return this;
        }

        public Produto build(){    
            if (nome == null) {
                throw new IllegalArgumentException("O nome do produto deve ser informado!");
            }if (preco <= 0) {
                throw new IllegalArgumentException("O preço do produto deve ser informado!");
            }
            return new Produto(this);
        }
    }
}
