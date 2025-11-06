public class Main {
    public static void main(String[] args) throws PowerException, PriceException {
        Books book1 = new Books(50.0, 101, "George Orwell", "1984");
        System.out.println("Book: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.printf("Original Price: $%.2f\n", book1.getPrice());
        System.out.printf("Promo Price: $%.2f\n\n", book1.checkPromo());
        try {
            book1.setPrice(-10);
        } catch (PriceException e) {
            System.out.println("Price error: " + e.getMessage());
        }
        TVS tv1 = new TVS(1200.0, 202, "Samsung", "QLED-55", 150);
        System.out.println("TV: " + tv1.getBrand() + " " + tv1.getModel());
        System.out.printf("Original Price: $%.2f\n", tv1.getPrice());
        System.out.printf("Promo Price: $%.2f\n", tv1.checkPromo());
        tv1.useOfEnergy(3.5);
        try {
            tv1.setPower(-50);
        } catch (PowerException e) {
            System.out.println("Power error: " + e.getMessage());
        }
        try{
            tv1.setPrice(-200);
        }catch (PriceException e) {
            System.out.println("Price error: " + e.getMessage());
        }
    }
}
