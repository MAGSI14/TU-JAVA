public class Ship extends Vehicle implements IsSeaVessel{
    private double deadWeight;

    public Ship(double maxSpeed, String model, double price, double deadWeight) {
        super(maxSpeed, model, price);
        this.deadWeight = deadWeight;
    }

    public double getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    @Override
    public void enterSea() {
        System.out.println("The ship is in the sea!");
    }

    @Override
    public double checkPromo() {
        return 0.997;
    }

    @Override
    public String toString() {
        return "The vehicle is ship with "+ this.deadWeight + " deadweight. " + super.toString();
    }
}
