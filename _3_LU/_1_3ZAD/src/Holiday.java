public class Holiday extends Travel{
    private String hotelName;

    public Holiday(String destination, int length, float price, String hotelName) {
        super(destination, length, price);
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public float fixPrice() {
        return (float) (getPrice()*1.4);
    }
}
