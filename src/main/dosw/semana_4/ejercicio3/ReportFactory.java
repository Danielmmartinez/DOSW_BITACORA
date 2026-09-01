public class ReportFactory {

    public static ReportGenerator create(String type) {

        switch (type.toUpperCase()) {

            case "PDF":
                return new PdfReport();

            case "EXCEL":
                return new ExcelReport();

            case "CSV":
                return new CsvReport();

            default:
                throw new IllegalArgumentException(
                        "Tipo de reporte no soportado");
        }
    }
}