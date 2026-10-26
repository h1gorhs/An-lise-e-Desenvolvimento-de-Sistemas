
import java.util.HashMap;
import java.util.Map;

public class ReportManager {
    
    private Map<String, Report> listaPrototiposRelatorios = new HashMap<>();

    public ReportManager(){
        // Inicializa os protótipos
        // Inicialização pesada é feita aqui
        listaPrototiposRelatorios.put("PDF", new PDFReport()); // Protótipo de relatório no formato PDF
        listaPrototiposRelatorios.put("HTML", new HTMLReport());
    }

    public Report getRelatorio(String tipo){
        return this.listaPrototiposRelatorios.get(tipo).clone();
    }

}
