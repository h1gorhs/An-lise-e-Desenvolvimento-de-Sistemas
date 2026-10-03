// Estado compartilhado
public class Formatacao {
    
    private String fonte;
    private int tamanho;
    private String estilo;

    public Formatacao(String estilo, String fonte, int tamanho) {
        this.estilo = estilo;
        this.fonte = fonte;
        this.tamanho = tamanho;
    }

    public String getFonte() {
        return fonte;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getEstilo() {
        return estilo;
    }

    public String toString(){
        return "Fonte: " + fonte + ", Tamanho: " + tamanho + ", Estilo: " + estilo;
    }

}
