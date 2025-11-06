public class Device {
    private double inputU;
    private String modelCPU;

    public Device(double inputU, String modelCPU) {
        this.inputU = inputU;
        this.modelCPU = modelCPU;
    }

    public double getInputU() {
        return inputU;
    }

    public String getModelCPU() {
        return modelCPU;
    }
    public void turnOn(){
        System.out.println("The device is turned in!");
    }
    public void turnOff(){
        System.out.println("The device is turned off!");
    }

    @Override
    public String toString() {
        return "This device has input of " + this.inputU + "V and CPU - " + this.modelCPU;
    }
}
