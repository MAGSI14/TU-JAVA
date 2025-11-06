public class Excursion extends Travel implements NightsCount{
    private int hotelCount;

    public Excursion(String destination, int length, float price, int hotelCount) {
        super(destination, length, price);
        this.hotelCount = hotelCount;
    }

    public int getHotelCount() {
        return hotelCount;
    }

    public void setHotelCount(int hotelCount) {
        this.hotelCount = hotelCount;
    }

    @Override
    public float fixPrice() {
        return (float)(this.getPrice()*1.1);
    }

    @Override
    public int nightsCount() {
        return getLength()-2;
    }
}
