// Prototype
public interface Report extends Cloneable {
    Report clone();
    void generateReport(String studentName, double[] grades);
}