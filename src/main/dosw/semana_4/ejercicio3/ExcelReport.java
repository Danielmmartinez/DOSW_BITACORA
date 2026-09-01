public class ExcelReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato Excel");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando Excel");
    }
}