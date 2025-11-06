public class Main {
    public static void main(String[] args) {
        Car car = new Car(220, "BMW M3", 75000, 350);
        Ship ship = new Ship(55, "Ocean Explorer", 5000000, 20000);
        Hovercraft hovercraft = new Hovercraft(90, "HC-200", 150000, 30);

        System.out.println("=== Vehicle Info ===");
        System.out.println(car);
        System.out.println(ship);
        System.out.println(hovercraft);
        System.out.println();

        System.out.println("=== Entering environments ===");
        car.enterLand();
        ship.enterSea();
        hovercraft.enterLand();
        hovercraft.enterSea();
        System.out.println();

        System.out.println("=== Promo Prices ===");
        System.out.println("Car promo price: " + (car.getPrice() * car.checkPromo()));
        System.out.println("Ship promo price: " + (ship.getPrice() * ship.checkPromo()));
        System.out.println("Hovercraft promo price: " + (hovercraft.getPrice() * hovercraft.checkPromo()));
    }
}
