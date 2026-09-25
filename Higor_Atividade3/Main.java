package Higor_Atividade3;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio.Builder()
            .setTitulo("O Príncipe")
            .setAutor("Maquiavel")
            .setData(LocalDate.now())
            .setResumo("Resumo do Livro")
            .setConteudo("Conteúdo do livro")
            .setPrioridade(1)
            .setRodape("UNIPAM")
            .setDepartamento("Política")
            .build();

        System.out.println(relatorio);

        IRelatorio relatorio2 = new RelatorioSimples();

        relatorio2 = new MarcaDagua(relatorio2);

        relatorio2 = new Criptografia(relatorio2);

        relatorio2 = new Compactacao(relatorio2);

        relatorio2 = new AssinaturaDigital(relatorio2);

        relatorio2.gerar();
    }
}
