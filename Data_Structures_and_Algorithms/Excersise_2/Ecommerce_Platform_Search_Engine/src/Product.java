public class Product {
    private final String productName;
    private final String productID;
    private final String category;

    public Product(String productID, String productName, String category) {
        this.productName = productName;
        this.productID = productID;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productID;
    }

    public String getCategory() {
        return category;
    }
}