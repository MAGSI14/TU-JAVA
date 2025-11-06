public class Car extends Vehicle implements IsLandVehicle{
    private int kW;


    public Car(double maxSpeed, String model, double price, int kW) {
        super(maxSpeed, model, price);
        this.kW = kW;
    }

    public int getkW() {
        return kW;
    }

    public void setkW(int kW) {
        this.kW = kW;
    }

    @Override
    public void enterLand() {
        System.out.println("The car is on land!");
    }

    @Override
    public double checkPromo() {
        return 0.8;
    }

    @Override
    public String toString() {
        return "The vehicle is car with "+ this.kW + " kW engine. " + super.toString();
    }
}
