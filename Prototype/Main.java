public class Main {
    public static void main(String[] args) {
        
        ReportManager gerenciadorRelatorios = new ReportManager();

        //Dados dos alunos
        String nomeAluno1 = "John Doe";
        double[] notasAluno1 = {90.0, 85.0, 78.0, 92.5};

        String nomeAluno2 = "Alexandre";
        double[] notasAluno2 = {50.0, 65.0, 70.0, 51.5};

        Report relatorioHTML = gerenciadorRelatorios.getRelatorio("HTML");
        Report relatorioPDF = gerenciadorRelatorios.getRelatorio("PDF");
        relatorioPDF.generateReport(nomeAluno2, notasAluno2);
        relatorioPDF.generateReport(nomeAluno1, notasAluno1);
        relatorioPDF.generateReport(nomeAluno2, notasAluno2);
        relatorioPDF.generateReport(nomeAluno1, notasAluno1);
        relatorioPDF.generateReport(nomeAluno2, notasAluno2);
        relatorioPDF.generateReport(nomeAluno1, notasAluno1);
        relatorioPDF.generateReport(nomeAluno2, notasAluno2);
        relatorioPDF.generateReport(nomeAluno1, notasAluno1);
        relatorioHTML.generateReport(nomeAluno2, notasAluno2);
        relatorioHTML.generateReport(nomeAluno1, notasAluno1);
        relatorioHTML.generateReport(nomeAluno2, notasAluno2);
        relatorioHTML.generateReport(nomeAluno1, notasAluno1);
        relatorioHTML.generateReport(nomeAluno2, notasAluno2);
        relatorioHTML.generateReport(nomeAluno1, notasAluno1);

        //Report relatorioPDF2 = gerenciadorRelatorios.getRelatorio("PDF");
        //relatorioPDF2.generateReport(nomeAluno1, notasAluno1);



    }
}
