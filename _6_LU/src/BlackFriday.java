import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BlackFriday {
    public static Electronics[] electronicsArr = new Electronics[0];
    public static Book[] booksArr = new Book[0];
    public static void processSales() {
        ProductLoader loader = new ProductLoader();
        try {
            Product[] products = loader.read();
            if (products == null || products.length == 0) {
                System.out.println("No products found in file.");
                return;
            }
            List<Electronics> electronicsList = new ArrayList<>();
            List<Book> bookList = new ArrayList<>();

            for (Product prod : products) {
                if (prod instanceof Electronics) {
                    electronicsList.add((Electronics) prod);
                } else if (prod instanceof Book) {
                    bookList.add((Book) prod);
                }
            }
            electronicsArr = electronicsList.toArray(new Electronics[0]);
            booksArr = bookList.toArray(new Book[0]);
            System.out.println("Products for Black Friday:");
            System.out.println("Electronics: " + electronicsArr.length);
            System.out.println("Books: " + booksArr.length);
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        processSales();
        if (electronicsArr.length > 0) {
            System.out.println("\nElectronics:");
            for (Electronics e : electronicsArr) {
                System.out.println(e);
                System.out.printf("Promotional price: %.2f лв.%n", e.getPromoPrice());
            }
        }
        if (booksArr.length > 0) {
            System.out.println("\nBooks:");
            for (Book b : booksArr) {
                System.out.println(b);
                System.out.printf("Promotional price: %.2f лв.%n", b.getPromoPrice());
            }
        }
    }
}
