public abstract class WordDocument extends WordDocumentSpecifications{
    @Override
    public void create() {
        System.out.println("Creating a new Word document...");
    }

    @Override
    public void open() {
        System.out.println("Opening an existing Word document...");
    }

    @Override
    public void close() {
        System.out.println("Closing the Word document...");
    }
}
