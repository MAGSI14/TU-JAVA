import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Service {
    private ArrayList<Device> usable;
    private ArrayList<BrokenDevice> broken;

    private final String HEALTHY = "healthy_dev.ser";
    private final String BROKEN = "broken_dev.ser";

    public Service() {
        this.usable = new ArrayList<>();
        this.broken = new ArrayList<>();
        loadData();
    }

    public void loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(HEALTHY))) {
            usable = (ArrayList<Device>) in.readObject();
        } catch (Exception e) {
            usable = new ArrayList<>();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(BROKEN))) {
            broken = (ArrayList<BrokenDevice>) in.readObject();
        } catch (Exception e) {
            broken = new ArrayList<>();
        }
    }
    private void saveData(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(HEALTHY))){
            out.writeObject(usable);
        }catch (Exception ignored){}
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(BROKEN))){
            out.writeObject(broken);
        }catch (Exception ignored){}
    }

    public void addDevice(Device device){
        if(!usable.contains(device)) {
            usable.add(device);
            saveData();
        }
    }
    public void addBrokenDevice(BrokenDevice device){
        if(!broken.contains(device)) {
            broken.add(device);
            saveData();
        }
    }
    public void repairedDevice(BrokenDevice brokenDev){
        if(broken.contains(brokenDev)){
            usable.add(brokenDev);
            broken.remove(brokenDev);
        }
    }
    public void printProblematic(String symptom){
        for (int i = 0; i < broken.size(); i++) {
            if(broken.get(i).getSymptoms().equals(symptom)){
                System.out.println(broken.get(i).toString());
            }
        }
    }
    public double priceSum(){
        double sum = 0.0;
        for (int i = 0; i < usable.size(); i++) {
            sum+=usable.get(i).getPrice();
        }
        for (int i = 0; i < broken.size(); i++) {
            sum+=broken.get(i).getPrice();
        }
        return sum;
    }
    public double repairIncome(double dailyWage){
        double cost = 0.00;
        for (int i = 0; i < broken.size(); i++) {
            cost+=dailyWage*broken.get(i).getRepairTime();
        }
        return cost;
    }
}
