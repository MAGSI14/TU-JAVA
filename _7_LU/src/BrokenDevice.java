import java.io.Serializable;

public class BrokenDevice extends Device implements Serializable{
    private String symptoms;
    private int repairTime;

    public BrokenDevice(String brand, String model, double price, String symptoms, int repairTime) {
        super(brand, model, price);
        this.symptoms = symptoms;
        this.repairTime = repairTime;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public int getRepairTime() {
        return repairTime;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getSymptoms() + " - " + getRepairTime();
    }
}
