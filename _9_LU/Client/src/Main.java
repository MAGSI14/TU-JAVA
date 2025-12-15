import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Connected to server.");
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1) Register");
                System.out.println("2) Login");
                System.out.print("> ");

                String choice = userInput.readLine();

                if (choice.equals("1")) {
                    System.out.print("Enter new username: ");
                    String user = userInput.readLine();

                    System.out.print("Enter new password: ");
                    String pass = userInput.readLine();

                    out.println("REGISTER " + user + " " + pass);
                    String response = in.readLine();

                    if (response.equals("REGISTER_OK")) {
                        System.out.println("Registration successful!");
                    } else {
                        System.out.println("Registration failed (username exists).");
                    }
                }
                else if (choice.equals("2")) {
                    System.out.print("Username: ");
                    String user = userInput.readLine();

                    System.out.print("Password: ");
                    String pass = userInput.readLine();

                    out.println("LOGIN " + user + " " + pass);
                    String response = in.readLine();

                    if (response.equals("LOGIN_OK")) {
                        System.out.println("Login successful!");
                        break;
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                }
            }

            System.out.println("You may now chat. Type 'bye' to exit.");

            String input;
            while ((input = userInput.readLine()) != null) {
                out.println(input);
                String response = in.readLine();
                System.out.println(response);

                if (input.equalsIgnoreCase("bye"))
                    break;
            }

            System.out.println("Disconnected from server.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
