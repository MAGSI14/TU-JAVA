import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String personName = scanner.nextLine();
        System.out.print("EGN: ");
        String EGN = scanner.nextLine();
        Person person1 = new Person(personName, EGN);
        System.out.printf("This person is %s and EGN - %s\n", person1.getName(), person1.getEgn());

        System.out.print("Faculty number: ");
        String facultyNum = scanner.nextLine();
        Student student1 = new Student(personName, EGN, facultyNum);
        student1.setFacNumber("121224189");
        System.out.printf("Info about the student: name - %s, EGN - %s, faculty number - %s\n", student1.getName(), student1.getEgn(), student1.getFacNumber());

        System.out.print("Name of course: ");
        String courseName = scanner.nextLine();
        Course course = new Course(courseName);
        Teacher teacher = new Teacher(personName, EGN, course);
        teacher.setName("Niya");
        teacher.setEgn("720611");
        course.setName("PNPE");
        teacher.setNameOfCourse(course);
        System.out.printf("The teacher is %s, EGN - %s, the name of their discipline is %s", teacher.getName(), teacher.getEgn(), teacher.getNameOfCourse());
    }
}