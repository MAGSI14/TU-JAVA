import java.io.*;
import java.net.*;

public class Main {

    private static final String USER_FILE = "users.txt";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server running on port 12345...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                handleClient(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            while (true) {
                String command = in.readLine();
                if (command == null)
                    return;

                String[] parts = command.split(" ");
                if (parts.length < 3) {
                    out.println("INVALID_COMMAND");
                    continue;
                }

                String action = parts[0];
                String username = parts[1];
                String password = parts[2];

                if (action.equalsIgnoreCase("REGISTER")) {

                    if (registerUser(username, password)) {
                        out.println("REGISTER_OK");
                    } else {
                        out.println("REGISTER_FAIL");
                    }
                }

                else if (action.equalsIgnoreCase("LOGIN")) {

                    if (loginUser(username, password)) {
                        out.println("LOGIN_OK");
                        break;
                    } else {
                        out.println("LOGIN_FAIL");
                    }
                }
            }

            out.println("WELCOME_TO_CHAT");
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client says: " + message);
                out.println("Server received: " + message);

                if (message.equalsIgnoreCase("bye"))
                    break;
            }

            socket.close();
            System.out.println("Client disconnected.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean registerUser(String username, String password) {

        if (username.isBlank() || password.isBlank()) {
            return false;
        }
        if (username.contains(" ") || password.contains(" ")) {
            return false;
        }
        try {
            File file = new File(USER_FILE);
            file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {

                if (!line.contains(":")) {
                    continue;
                }
                String[] parts = line.split(":");
                if (parts.length != 2) {
                    continue;
                }
                String storedUser = parts[0];
                if (storedUser.equalsIgnoreCase(username)) {
                    br.close();
                    return false;
                }
            }
            br.close();

            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println(username + ":" + password);
            pw.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private static boolean loginUser(String username, String password) {

        if (username.isBlank() || password.isBlank())
            return false;

        try {
            File file = new File(USER_FILE);
            if (!file.exists()) {
                return false;
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {

                if (!line.contains(":")) {
                    continue;
                }
                String[] parts = line.split(":");
                if (parts.length != 2) {
                    continue;
                }
                String storedUser = parts[0];
                String storedPass = parts[1];

                if (storedUser.equalsIgnoreCase(username) && storedPass.equals(password)) {
                    br.close();
                    return true;
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
