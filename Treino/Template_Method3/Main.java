package Template_Method3;

public class Main {
    public static void main(String[] args) {
        PDF pdf = new PDF();
        CSV csv = new CSV();
        
        pdf.gerar();

        System.out.println();

        csv.gerar();
    }
}
