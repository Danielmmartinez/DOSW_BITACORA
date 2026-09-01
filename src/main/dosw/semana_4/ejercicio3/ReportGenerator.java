public abstract class ReportGenerator {

    public final void generate() {

        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    protected void fetchData() {
        System.out.println("Obteniendo datos...");
    }

    protected void processData() {
        System.out.println("Procesando información...");
    }

    protected abstract void applyFormat();

    protected abstract void exportFile();
}