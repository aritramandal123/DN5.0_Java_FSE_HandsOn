
public class SearchEngine {

    public static Product[] productDataInit() {
        Product[] products = {
            new Product("P1005", "Mechanical Keyboard", "Electronics"),
            new Product("P1001", "Wireless Mouse", "Electronics"),
            new Product("P1008", "Ergonomic Office Chair", "Furniture"),
            new Product("P1003", "Noise Cancelling Headphones", "Electronics"),
            new Product("P1012", "Leather Notebook", "Stationery"),
            new Product("P1002", "USB-C Hub Adapter", "Electronics"),
            new Product("P1009", "Stainless Steel Water Bottle", "Home Utilities")
        };
        return products;
    }

    public static int linearSearch(Product[] products, String targetId) {
        int steps = 0;
        for (int i = 0; i < products.length; i++) {
            steps++;
            if (products[i].getProductId().equals(targetId)) {
                System.out.println("-> [Linear Search] Target found in " + steps + " steps.");
                return i; // Returns index of the found item
            }
        }
        System.out.println("-> [Linear Search] Target NOT found after " + steps + " steps.");
        return -1;
    }

    public static int binarySearch(Product[] products, String targetId) {
        int steps = 0;
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            String midId = products[mid].getProductId();

            if (midId.equals(targetId)) {
                System.out.println("-> [Binary Search] Target found in " + steps + " steps.");
                return mid; // Returns index of the found item
            } else if (midId.compareTo(targetId) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        System.out.println("-> [Binary Search] Target NOT found after " + steps + " steps.");
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = productDataInit();

        // Sort products by product ID for binary search
        java.util.Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        String targetId = "P1009"; // Example target product ID

        // Perform linear search
        System.out.println("Searching for Product ID: " + targetId + " using Linear Search...\n");
        int linearIndex = linearSearch(products, targetId);
        if (linearIndex != -1) {
            System.out.println("Result: " + products[linearIndex]);
        }

        // Perform binary search
        System.out.println("Searching for Product ID: " + targetId + " using Binary Search...\n");
        int binaryIndex = binarySearch(products, targetId);
        if (binaryIndex != -1) {
            System.out.println("Result: " + products[binaryIndex]);
        }
    }
}
