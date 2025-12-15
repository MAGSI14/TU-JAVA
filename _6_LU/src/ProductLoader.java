import java.io.*;

public class ProductLoader implements ImportData {

    @Override
    public Object[] ImportDataFromFile() throws IOException {
        return new Object[0];
    }

    public void write(Object obj) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("products.ser"))) {
            out.writeObject(obj);
            out.flush();
            System.out.println("Successfully written!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Product[] read() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("products.ser"))) {
            Object obj = in.readObject();
            if (obj instanceof Product) {
                return (Product[]) obj;
            } else {
                System.out.println("That is not a Product array!");
                return new Product[0];
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Product[0];
        }
    }
}
