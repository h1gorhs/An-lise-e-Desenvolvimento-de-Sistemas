public class PDFReport implements Report {

    public PDFReport(){
        System.out.println("Criando objeto PDF...");
        this.getDados();
    }

    @Override
    public Report clone() {
        
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning PDF report", e);
        }
    }

    public void getDados(){
        System.out.println("Buscando dados...");
        System.out.println("");
        try {
            Thread.sleep(7000); // Simula tempo de consulta no banco
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generateReport(String studentName, double[] grades) {
        System.out.println("Generating PDF Report");
        System.out.println("Student: " + studentName);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nExporting report as PDF...");
        System.out.println("");
    }
}