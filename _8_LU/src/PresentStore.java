import java.util.*;
public class PresentStore {
    ArrayList<GetProductsTo> products;
    ArrayList<DeliveryAPI>devAPI;

    public PresentStore(ArrayList<GetProductsTo> products, ArrayList<DeliveryAPI> devAPI) {
        this.products = products;
        this.devAPI = devAPI;
    }

    public ArrayList<GetProductsTo> getProducts() {
        return products;
    }

    public ArrayList<DeliveryAPI> getDevAPI() {
        return devAPI;
    }
    public void getCheaper(double maxPrice){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getPrice() <=maxPrice){
                System.out.println(products.get(i).getType());
            }
        }
    }
    public void returnProdById(int id){
        for (int i = 0; i < devAPI.size(); i++) {
            if(devAPI.get(i).getTdOfProvider() == id){
                System.out.println(devAPI.get(i).getType(id) + " - " + devAPI.get(i).GetNumber(id));
            }
        }
    }
}
