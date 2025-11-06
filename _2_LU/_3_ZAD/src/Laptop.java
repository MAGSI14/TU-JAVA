public class Laptop extends Device{
    private double RAMMemory;
    private double HDMemory;

    public Laptop(double inputU, String modelCPU, double RAMMemory, double HDMemory) {
        super(inputU, modelCPU);
        this.RAMMemory = RAMMemory;
        this.HDMemory = HDMemory;
    }

    public double getRAMMemory() {
        return RAMMemory;
    }

    public void setRAMMemory(double RAMMemory) {
        this.RAMMemory = RAMMemory;
    }

    public double getHDMemory() {
        return HDMemory;
    }

    public void setHDMemory(double HDMemory) {
        this.HDMemory = HDMemory;
    }
    public boolean isBetter(Laptop laptop2){
        if(this.getRAMMemory() > laptop2.getRAMMemory() && this.getHDMemory()> laptop2.getHDMemory()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ". It has "+ this.RAMMemory + "GB RAM and the memory of the hard disk is " + this.HDMemory;
    }
}
