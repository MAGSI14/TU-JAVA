public abstract class Products {
    private double price;
    private int prodNumber;

    public Products(double price, int prodNumber) throws PriceException {
        setProdNumber(prodNumber);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {
        if(price<0){
            throw new PriceException("The price cannot be negative number!");
        } else {
            this.price = price;
        }
    }

    public int getProdNumber() {
        return prodNumber;
    }

    public void setProdNumber(int prodNumber) {
        this.prodNumber = prodNumber;
    }

    public abstract double checkPromo();
}
