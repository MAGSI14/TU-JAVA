import java.util.*;

public class App {
    public static void main(String[] args) {

        try {

            ArrayList<GetProductsTo> products = new ArrayList<>();
            ArrayList<DeliveryAPI> devAPI = new ArrayList<>();

            Product1 p1 = new Product1("Toy", 20.0, 1, 5);
            Product2 p2 = new Product2("Book", 35.0, 2, 3);
            Product3 p3 = new Product3("Game", 10.0, 1, 8);
            Product1 p4 = new Product1("Chocolate", 5.0, 3, 20);

            products.add(p1);
            products.add(p2);
            products.add(p3);
            products.add(p4);

            devAPI.add(p1);
            devAPI.add(p2);
            devAPI.add(p3);
            devAPI.add(p4);

            if (products.isEmpty()) {
                throw new IllegalStateException("There are no products in the store.");
            }

            if (devAPI.isEmpty()) {
                throw new IllegalStateException("There are no providers.");
            }

            PresentStore store = new PresentStore(products, devAPI);

            double maxPrice = 25;
            if (maxPrice < 0) {
                throw new IllegalArgumentException("The maximum value of a product cannot be negative!");
            }

            System.out.println("=== Products cheaper than " + maxPrice + " ===");
            store.getCheaper(maxPrice);

            int providerId = 1;
            boolean exists = false;

            for (DeliveryAPI d : devAPI) {
                if (d.getTdOfProvider() == providerId) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                throw new NoSuchElementException("There is no provider with ID: " + providerId);
            }

            System.out.println("\n=== Products from provider with ID = " + providerId + " ===");
            store.returnProdById(providerId);

        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage());
        }

    }
}
