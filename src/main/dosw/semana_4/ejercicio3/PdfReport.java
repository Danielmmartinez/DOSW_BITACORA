public class PdfReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato PDF");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando PDF");
    }
}