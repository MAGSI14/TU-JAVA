import java.io.Serializable;

public abstract class Product implements ValidatePhone, Serializable {
    private int inventoryNumber;
    private double price;

    public Product(int inventoryNumber, double price) {
        this.inventoryNumber = inventoryNumber;
        this.price = price;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getPromoPrice();
    public abstract boolean sellProduct(int piece) throws NoMoreProductsException;

    @Override
    public String toString() {
        return String.format("Inventory: %d | Price: %.2f", inventoryNumber, price);
    }
}
