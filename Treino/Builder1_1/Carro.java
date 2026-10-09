package Builder1_1;

public class Carro {
    
    private String marca; 
    private String modelo;
    private int ano;
    private String cor;

    private Carro(Builder builder){
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.ano = builder.ano;
        this.cor = builder.cor;
    }

    @Override 
    public String toString(){
        return "Carro: {\n" +
        "   Marca: " + marca + "\n" +
        "   Modelo: " + modelo + "\n" +
        "   Ano: " + ano + "\n" +
        "   Cor: " + cor + "\n}\n";
    }

    public static class Builder {
    
        private String marca;
        private String modelo;
        private int ano;
        private String cor;

        public Builder setMarca(String marca){
            this.marca = marca;
            return this;
        }

        public Builder setModelo(String modelo){
            this.modelo = modelo;
            return this;
        }

        public Builder setAno(int ano){
            this.ano = ano;
            return this;
        }

        public Builder setCor(String cor){
            this.cor = cor;
            return this;
        }

        public Carro build(){
            return new Carro(this);
        }
    }
}
