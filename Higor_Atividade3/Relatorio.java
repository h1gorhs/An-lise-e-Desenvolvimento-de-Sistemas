package Higor_Atividade3;
import java.time.LocalDate;

public class Relatorio {

    private String titulo;
    private String autor;
    private LocalDate data;
    private String resumo;
    private String conteudo;
    private int prioridade;
    private String rodape;
    private String departamento;

    private Relatorio(Builder builder){
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.data = builder.data;
        this.resumo = builder.resumo;
        this.conteudo = builder.conteudo;
        this.prioridade = builder.prioridade;
        this.rodape = builder.rodape;
        this.departamento = builder.departamento;
    }

    @Override 
    public String toString(){
        return "Livro{\n" +
                "Título: '" + titulo + "'\n" +
                "Autor: '" + autor + "'\n" +
                "Data: " + data + "\n" +
                "Resumo: " + resumo + "\n" +
                "Conteúdo: " + conteudo + "\n" +
                "Prioridade: " + prioridade + "\n" +
                "Rodape: " + rodape + "\n" +
                "Departamento: " + departamento + "\n}";
    }

    public static class Builder {
    
    private String titulo;
    private String autor;
    private LocalDate data;
    private String resumo;
    private String conteudo;
    private int prioridade;
    private String rodape;
    private String departamento;

    public Builder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    public Builder setAutor(String autor) {
        this.autor = autor;
        return this;
    }
    public Builder setData(LocalDate data) {
        this.data = data;
        return this;
    }
    public Builder setResumo(String resumo) {
        this.resumo = resumo;
        return this;
    }
    public Builder setConteudo(String conteudo) {
        this.conteudo = conteudo;
        return this;
    }
    public Builder setPrioridade(int prioridade) {
        this.prioridade = prioridade;
        return this;
    }
    public Builder setRodape(String rodape) {
        this.rodape = rodape;
        return this;
    }
    public Builder setDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }
    
    public Relatorio build(){
        return new Relatorio(this);
    }
    }
}
