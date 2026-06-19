public abstract class PdfDocument extends PdfDocumentSpecifications{
    @Override
    public void create() {
        System.out.println("Creating a new PDF document...");
    }

    @Override
    public void open() {
        System.out.println("Opening an existing PDF document...");
    }

    @Override
    public void close() {
        System.out.println("Closing the PDF document...");
    }
}
