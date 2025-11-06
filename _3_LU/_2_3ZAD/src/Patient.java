public abstract class Patient {
    private String name;
    private String address;
    private int EGN;

    public Patient(String name, String address, int EGN) {
        this.name = name;
        this.address = address;
        this.EGN = EGN;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEGN() {
        return EGN;
    }

    public void setEGN(int EGN) {
        this.EGN = EGN;
    }
    public abstract void cure(String medicament, int quantity);
}
