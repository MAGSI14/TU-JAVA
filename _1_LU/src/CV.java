import java.util.*;
public class CV {
    public static void main(String[] args) {
        System.out.println("Its time to tell me some things about you so i can create your CV!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? - ");
        String name = scanner.nextLine();
        System.out.print("How old are you? - ");
        int age = scanner.nextInt();
        System.out.print("Where are you located? - ");
        String location = scanner.nextLine();
        System.out.print("What is your phone number? - ");
        long pNumber= scanner.nextLong();
        System.out.print("What is your e-mail address? - ");
        String email = scanner.nextLine();
        System.out.print("What are your best skills? - ");
        String [] skills = scanner.nextLine().split("\\s+");
        System.out.print("Do you have any past professional experience? - ");
        String [] experience = scanner.nextLine().split("\\s+");

        System.out.printf("%s - %d years old \n", name, age);
        System.out.printf("Based in %s \n", location);
        System.out.printf("Phone number: %d \n", pNumber);
        System.out.printf("E-mail: %s \n", email);
        System.out.println("Best skills: \n");
        for (int i = 0; i < skills.length; i++) {
            System.out.println("-" + skills[i]);
        }
        System.out.println("My past experience is working as a/an: ");
        for (int i = 0; i < experience.length; i++) {
            System.out.println("-" +experience[i]);
        }
    }
}
