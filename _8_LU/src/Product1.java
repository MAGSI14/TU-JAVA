public class Product1 implements GetProductsTo, DeliveryAPI{
    private String type;
    private double price;
    private int idOfProvider;
    private int number;

    public Product1(String type, double price, int idOfProvider, int number) {
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int GetNumber(int idOfProvider) {
        if (idOfProvider == this.idOfProvider){
            return number;
        }else{
            return 0;
        }
    }

    @Override
    public String getType(int idOfProvider) {
        if(this.idOfProvider == idOfProvider){
            return type;
        }else{
            return null;
        }
    }

    @Override
    public int getTdOfProvider() {
        return idOfProvider;
    }
}
