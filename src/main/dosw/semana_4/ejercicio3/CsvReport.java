public class CsvReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato CSV");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando CSV");
    }
}