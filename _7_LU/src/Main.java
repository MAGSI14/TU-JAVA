import java.io.File;
public class Main {
    public static void main(String[] args) {
        new File("healthy_dev.ser").delete();
        new File("broken_dev.ser").delete();
        Service service = new Service();
        Device d1 = new Device("Samsung", "Galaxy S22", 1200);
        Device d2 = new Device("Lenovo", "ThinkPad X1", 2100);

        service.addDevice(d1);
        service.addDevice(d2);

        BrokenDevice b1 = new BrokenDevice("Apple", "iPhone 12", 1500, "Screen cracked", 4);
        BrokenDevice b2 = new BrokenDevice("HP", "Pavilion Gaming", 1800, "Overheating", 3);

        service.addBrokenDevice(b1);
        service.addBrokenDevice(b2);

        System.out.println("Devices with symptom 'Overheating':");
        service.printProblematic("Overheating");

        System.out.println("\nRepairing device: " + b1);
        service.repairedDevice(b1);

        System.out.println("\nTotal price of all devices:");
        System.out.println(service.priceSum());

        System.out.println("\nIncome from repairs (50 per day):");
        System.out.println(service.repairIncome(50));

    }
}
