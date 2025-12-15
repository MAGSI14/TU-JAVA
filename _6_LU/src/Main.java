public class Main {
    public static void main(String[] args) {
        try {
            Provider provider = new Provider("Technomarket", 888123456);
            Electronics e = new Electronics(101, 1200.0, "Sony", "Bravia");
            Book b = new Book(202, 30.0, "J.K. Rowling", "Harry Potter");
            System.out.println(e);
            System.out.println("Promotional price: " + e.getPromoPrice());
            e.sellProduct(2);
            System.out.println("Sold 2 units of Electronics. Remaining inventory: " + e.getInventoryNumber());
            System.out.println(b);
            System.out.println("Promotional price: " + b.getPromoPrice());
            b.sellProduct(11);

        } catch (NoMoreProductsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
