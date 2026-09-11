package Composite;
//Objeto folha
public class Arquivo extends FileSystemComponent {
    
    private double tamanhoArquivo;

    public Arquivo(String nomeArquivo, double tamanhoArquivo){
        super(nomeArquivo);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double getTamanhoArquivo(){
        return this.tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo){
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void display(String indent){
        System.out.println(indent + "Arquivo: " + getNomeArquivo());
    }
}
