import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", 5),
                new Student("Maria", 6),
                new Student("Georgi", 4),
                new Student("Anna", 6)
        );

        List<Student> excellent = students.stream()
                .filter(s -> s.getGrade() == 6)
                .toList();

        List<String> names = excellent.stream()
                .map(Student::getName)
                .toList();

        List<String> sortedNames = names.stream()
                .sorted()
                .toList();

        System.out.println(sortedNames);
    }
}