import java.util.*;
import java.util.List;
public class Main {
    public static void main(String[] args) throws NoHouseException {
        List<House> houses = new ArrayList<House>();

        if(houses.isEmpty()) {
            throw new NoHouseException("There are no houses");
        }
        House house = houses.get(0);
        for(House h : houses) {
            if(h == house) {
                continue;
            }
            if(h.getHeight() / h.getCountFloors() > house.getHeight() / house.getCountFloors()) {
                house = h;
            }
        }
        house.Details();
    }
    public static House enterHouse() {
        Scanner sc = new Scanner(System.in);

        double height, width;
        String adress, ownerName;
        int floors;

        try {
            height = sc.nextDouble();
            width = sc.nextDouble();
            adress = sc.next();
            ownerName = sc.next();
            floors = sc.nextInt();
            return new House(height, width, adress, floors,
                    ownerName);
        }catch (Exception e) {
            System.out.println("Invalid value");
            System.exit(0);

        }
        return null;
    }
}