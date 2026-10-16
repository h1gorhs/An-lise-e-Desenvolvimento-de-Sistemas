package Template_Method3;

public abstract class Relatorio {
    
    public final void gerar(){
        abrirArquivo();
        gerarCabecalho();
        gerarDados();
        gerarRodape();
        fecharArquivo();
    }

    private void abrirArquivo(){
        System.out.println("Abrindo arquivo.");
    }

    protected abstract void gerarCabecalho();

    protected abstract void gerarDados();

    protected abstract void gerarRodape();

    private void fecharArquivo(){
        System.out.println("Fechando arquivo.");
    }
}
