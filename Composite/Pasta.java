package Composite;

import java.util.ArrayList;
import java.util.List;

//Objeto composto
public class Pasta extends FileSystemComponent{

    //A composição/agregação(Tem um)
    List<FileSystemComponent> arquivos = new ArrayList<>();
    
    public Pasta(String nomeArquivo){
        super(nomeArquivo);
    }

    @Override
    public void add(FileSystemComponent arquivo){
        this.arquivos.add(arquivo);
    }

    @Override
    public void remove(FileSystemComponent arquivo){
        this.arquivos.remove(arquivo);
    }    

    @Override
    public FileSystemComponent buscaFilho(int i){
        return this.arquivos.get(i);
    }

    @Override
    public void display(String indent){
        System.out.println(indent + "Pasta" + getNomeArquivo());
        for(FileSystemComponent arquivo: this.arquivos){
            arquivo.display("   ");
        }
    }

    @Override
    public double getTamanhoArquivo(){
        double tamanho = 0;
        for(FileSystemComponent arquivo: this.arquivos){
            tamanho += arquivo.getTamanhoArquivo();
        }
        return tamanho;
    }
}