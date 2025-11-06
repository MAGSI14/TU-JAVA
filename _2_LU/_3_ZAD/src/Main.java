import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputU = scanner.nextDouble();
        String CPU = scanner.nextLine();
        Device device = new Device(inputU, CPU);
        double RAM = scanner.nextDouble();
        double HD = scanner.nextDouble();
        Laptop laptop1 = new Laptop(inputU, CPU, RAM, HD);
        Laptop laptop2 = new Laptop(50, "Unknown", 16,256);
        laptop1.isBetter(laptop2);
        System.out.println(laptop1.toString());
    }
}