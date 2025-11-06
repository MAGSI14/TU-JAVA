import java.util.*;
public class _13_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text until the command stop:");
        String command = scanner.nextLine();
        while (!command.equals("stop")){
            command = scanner.nextLine();
        }
    }
}
