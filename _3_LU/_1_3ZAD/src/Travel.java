public abstract class Travel {
    private String destination;
    private int length;
    private float price;

    public Travel(String destination, int length, float price) {
        this.destination = destination;
        this.length = length;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public abstract float fixPrice();
}
