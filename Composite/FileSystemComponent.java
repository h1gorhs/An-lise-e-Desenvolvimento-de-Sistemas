package Composite;

import java.nio.channels.UnsupportedAddressTypeException;

//Componente
//Tipo comum entre os objetos composto e folha
public abstract class FileSystemComponent {
    
    private String nomeArquivo;
    private double tamanhoArquivo;

    public FileSystemComponent(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void add(FileSystemComponent arquivo){
        throw new UnsupportedAddressTypeException();
    }

    public void remove(FileSystemComponent arquivo){
        throw new UnsupportedAddressTypeException();
    }

    public FileSystemComponent buscaFilho(int i){
        throw new UnsupportedAddressTypeException();
    }

    public abstract void display(String indent);
}
