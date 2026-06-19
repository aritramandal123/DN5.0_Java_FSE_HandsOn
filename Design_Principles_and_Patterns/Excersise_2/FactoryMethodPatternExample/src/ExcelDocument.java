public abstract class ExcelDocument extends ExcelDocumentSpecifications {
    @Override
    public void create() {
        System.out.println("Creating a new Excel document...");
    }

    @Override
    public void open() {
        System.out.println("Opening an existing Excel document...");
    }

    @Override
    public void close() {
        System.out.println("Closing the Excel document...");
    }
    
}
