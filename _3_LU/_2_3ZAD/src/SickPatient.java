import java.util.*;
public class SickPatient extends Patient{
    private String medicalHistory;
    private String status;
    private int day;
    Scanner scanner = new Scanner(System.in);
    public SickPatient(String name, String address, int EGN, String medicalHistory, String status, int day) {
        super(name, address, EGN);
        this.medicalHistory = medicalHistory;
        this.status = status;
        this.day = day;
        if(day<1 || day>366){
            System.out.println("There is no such day in the year!");
            System.out.print("Enter a correct day: ");
            this.day = scanner.nextInt();
        }
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public void cure(String medicament, int quantity) {
        System.out.printf("This person is %s with %s - %d dose/s\n", this.status, medicament, quantity);
        this.medicalHistory += ", " + medicament + " - " + quantity;
    }
}

