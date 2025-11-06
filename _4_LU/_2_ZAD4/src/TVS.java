public class TVS extends Products implements ElectricalAppliance {
    private String brand;
    private String model;
    private int power;

    public TVS(double price, int prodNumber, String brand, String model, int power) throws PowerException{
        super(price, prodNumber);
        this.brand = brand;
        this.model = model;
        setPower(power);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws PowerException{
        if(power<0){
            throw new PowerException("The power should be > 0!!");
        }
        this.power = power;
    }

    @Override
    public double checkPromo() {
        return getPrice()*0.91;
    }

    @Override
    public void useOfEnergy(double hours) {
        System.out.printf("It uses %.2f energy\n", this.power*hours);
    }
}
