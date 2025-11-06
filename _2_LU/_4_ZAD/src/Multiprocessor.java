public class Multiprocessor {
    private int processorsNumber;
    private int coresNumber;
    private double frequency;

    public Multiprocessor(int processorsNumber, int coresNumber, double frequency) {
        this.processorsNumber = processorsNumber;
        this.coresNumber = coresNumber;
        this.frequency = frequency;
    }

    public int getProcessorsNumber() {
        return processorsNumber;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public double getFrequency() {
        return frequency;
    }
    public double convert() {
        if(this.coresNumber > 1) {
            return (0.7 * this.coresNumber) * (0.8 * this.processorsNumber) * this.frequency;
        } else {
            this.coresNumber = 1;
            return (0.7 * this.coresNumber) * (0.8 * this.processorsNumber) * this.frequency;
        }
    }

}
