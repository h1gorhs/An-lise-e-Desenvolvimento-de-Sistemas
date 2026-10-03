import java.util.HashMap;
import java.util.Map;

public class FormatacaoFabrica {
    
    private static final Map<String, Formatacao> formatacoes = new HashMap<>();

    public static Formatacao geFormatacao(String fonte, int tamanho, String estilo){
        // Chave composta para identificar o objeto intrinseco
        String chave = fonte+tamanho+estilo;
        Formatacao formatacao = formatacoes.get(chave);

        if(formatacao == null){
            formatacao = new Formatacao(estilo, fonte, tamanho);
            formatacoes.put(chave, formatacao);
        }
        return formatacao;
    }

    public static int lenLista(){
        return formatacoes.size();
    }
}
