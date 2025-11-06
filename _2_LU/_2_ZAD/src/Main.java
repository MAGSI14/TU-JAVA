import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String dateOfBirth = scanner.nextLine();
        Person person = new Person(name, dateOfBirth);
        System.out.println(person.toString());
        String facNum = scanner.nextLine();
        double gradePIK = scanner.nextDouble();
        double gradeTE = scanner.nextDouble();
        double gradePPE = scanner.nextDouble();
        Student student = new Student(name, dateOfBirth, facNum, gradePIK,gradeTE, gradePPE);
        System.out.println(student.toString());
        if(student.getGradePIK()<3.5){
            student.setGradePIK(5.44);
        }
        System.out.println(student.toString());
    }
}