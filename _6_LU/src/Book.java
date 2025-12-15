import java.io.Serializable;
public class Book extends Product implements Serializable {
    private String author;
    private String title;

    public Book(int inventoryNumber, double price, String author, String title) {
        super(inventoryNumber, price);
        this.author = author;
        this.title = title;
    }
    @Override
    public double getPromoPrice() {
        return getPrice() * 0.5;
    }
    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if (getInventoryNumber() > piece) {
            setInventoryNumber(getInventoryNumber() - piece);
            return true;
        } else {
            throw new NoMoreProductsException("There are not enough products!");
        }
    }

    @Override
    public String toString() {
        return String.format("Book: %s by %s | Price: %.2f", title, author, getPrice());
    }
}
