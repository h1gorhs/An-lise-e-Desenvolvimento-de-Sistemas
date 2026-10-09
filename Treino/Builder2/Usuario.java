package Builder2;

public class Usuario {
    
    private String nome;
    private String email;
    private int idade;
    private int telefone;
    private String cidade;

    private Usuario(Builder builder){
        this.nome = builder.nome;
        this.email = builder.email;
        this.idade = builder.idade;
        this.telefone = builder.telefone;
        this.cidade = builder.cidade;
    }

    @Override 
    public String toString(){
        return "Usuário {\n" +
        "   Nome: " + nome + "\n" +
        "   E-mail: " + email + "\n" +
        "   Idade: " + idade + "\n" +
        "   Telefone: " + telefone + "\n" +
        "   Cidade: " + cidade + "\n}\n";
    }

    public static class Builder {
    
        private String nome;
        private String email;
        private int idade;
        private int telefone;
        private String cidade;

        public Builder setNome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setIdade(int idade){
            this.idade = idade;
            return this;
        }

        public Builder setTelefone(int telefone){
            this.telefone = telefone;
            return this;
        }

        public Builder setCidade(String cidade){
            this.cidade = cidade;
            return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }
    }
}
