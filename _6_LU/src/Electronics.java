import java.io.Serializable;
public class Electronics extends Product implements Serializable {
    private String manufacturer;
    private String model;

    public Electronics(int inventoryNumber, double price, String manufacturer, String model) {
        super(inventoryNumber, price);
        this.manufacturer = manufacturer;
        this.model = model;
    }
    @Override
    public double getPromoPrice() {
        return getPrice() * 0.9;
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
        return String.format("Electronics: %s %s | Price: %.2f", manufacturer, model, getPrice());
    }
}
