public class Main {
    public static void main(String[] args) {
        SickPatient sickPatient = new SickPatient(
                "John Doe",
                "123 Main Street",
                123456789,
                "Diabetes, Hypertension",
                "Recovering",
                370
        );
        sickPatient.cure("Paracetamol", 2);
        sickPatient.cure("Antibiotic", 1);
        System.out.println("Updated status: " + sickPatient.getStatus());
        System.out.println("Whole medical history: " + sickPatient.getMedicalHistory());
    }
}