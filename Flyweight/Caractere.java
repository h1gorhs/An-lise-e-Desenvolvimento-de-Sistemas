public class Caractere{

    private char simbolo;
    private int linha;
    private int coluna;
    private Formatacao formatacao;

    public Caractere(char simbolo, int linha, int coluna, Formatacao formatacao) {
        this.simbolo = simbolo;
        this.linha = linha;
        this.coluna = coluna;
        this.formatacao = formatacao;
    } 

    public void exibir(){
        System.out.println("Caractere: " + simbolo + " [Linha: " + linha + ", Coluna: " + coluna + "] - " + formatacao);
    }

}