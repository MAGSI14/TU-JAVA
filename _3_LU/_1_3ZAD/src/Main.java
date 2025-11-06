public class Main {
    public static void main(String[] args) {
        Excursion excursion = new Excursion("Serbia", 4, 440, 4);
        System.out.printf("The new price for this excursion is %.2f\n", excursion.fixPrice());
        System.out.printf("You will be sleeping in %s for %d nights!\n", excursion.getDestination(), excursion.nightsCount());
        Holiday holiday = new Holiday("Japan", 12, 9300, "Address");
        System.out.printf("The new price for this holiday is %.2f\n", holiday.fixPrice());

    }
}