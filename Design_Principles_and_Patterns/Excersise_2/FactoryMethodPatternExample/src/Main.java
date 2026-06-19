
public class Main {

    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        System.out.println("\nTesting Word Document factory:");
        wordDocument.create();
        wordDocument.open();
        wordDocument.close();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        System.out.println("\nTesting Excel Document factory:");
        excelDocument.create();
        excelDocument.open();
        excelDocument.close();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        System.out.println("\nTesting PDF Document factory:");
        pdfDocument.create();
        pdfDocument.open();
        pdfDocument.close();

    }
}
