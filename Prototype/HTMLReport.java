// Protótipo de relatórios HTML
public class HTMLReport implements Report {

    // Construtor
    public HTMLReport(){
        System.out.println("Criando objeto HTML");
        this.getDados();
    }

    @Override
    public Report clone() {
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning HTML report", e);
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
        System.out.println("Generating HTML Report");
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Student: " + studentName + "</h1>");
        System.out.print("<p>Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("</p>");
        System.out.println("</body>");
        System.out.println("</html>");
        System.out.println("Exporting report as HTML...");
        System.out.println("");
    }
}