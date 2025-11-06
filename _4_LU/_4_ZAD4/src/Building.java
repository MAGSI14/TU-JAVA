public class Building {
    private double height;
    private double width;
    private String adress;

    public Building(double height, double width, String adress) {
        setHeight(height);
        setWidth(width);
        setAdress(adress);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
    }
}