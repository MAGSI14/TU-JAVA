public class House extends Building{
    private int countFloors;
    private String ownerName;


    public House(double height, double width, String adress, int countFloors, String ownerName) {
        super(height, width, adress);
        setCountFloors(countFloors);
        setOwnerName(ownerName);
    }

    public void Details(){
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
        System.out.println("Adress: " + getAdress());
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Count: " + this.countFloors);
    }

    public void setCountFloors(int countFloors) {
        this.countFloors = countFloors;
    }

    public int getCountFloors() {
        return countFloors;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
}