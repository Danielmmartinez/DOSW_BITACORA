public class Ejercicio3 {

    public static void main(String[] args) {

        ReportGenerator report =
                ReportFactory.create("PDF");

        report.generate();

        System.out.println();

        ReportGenerator excel =
                ReportFactory.create("EXCEL");

        excel.generate();
    }
}