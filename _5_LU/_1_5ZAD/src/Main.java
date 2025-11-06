import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[5];
        int userCount = 0;

        while (true) {
            System.out.println("=== МЕНЮ ===");
            System.out.println("1. Регистрация");
            System.out.println("2. Вход");
            System.out.print("Изберете опция: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                try {
                    System.out.print("Въведете потребителско име: ");
                    String username = scanner.nextLine();
                    boolean exists = false;
                    for (User u : users) {
                        if (u != null && u.getUsername().equals(username)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Потребител с това име вече съществува!");
                        continue;
                    }

                    System.out.print("Въведете парола: ");
                    String password1 = scanner.nextLine();
                    System.out.print("Повторете паролата: ");
                    String password2 = scanner.nextLine();

                    if (!password1.equals(password2)) {
                        System.out.println("Паролите не съвпадат!");
                        continue;
                    }

                    System.out.print("Въведете телефонен номер: ");
                    String phone = scanner.nextLine();
                    User newUser = new User(username, password1, phone);
                    users[userCount++] = newUser;
                    System.out.println("Регистрацията е успешна!");

                } catch (WrongUserException e) {
                    System.out.println("Грешка: " + e.getMessage());
                } catch (WrongPhoneNumberException e) {
                    System.out.println("Грешка: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Невалидни данни!");
                }

            } else if (choice.equals("2")) {
                System.out.print("Въведете потребителско име: ");
                String username = scanner.nextLine();
                System.out.print("Въведете парола: ");
                String password = scanner.nextLine();

                boolean found = false;
                for (User u : users) {
                    if (u != null && u.getUsername().equals(username)) {
                        found = true;
                        if (u.getPassword().equals(password)) {
                            System.out.println("Успешен вход! Добре дошли, " + username + "!");
                        } else {
                            System.out.println("Грешна парола!");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Такъв потребител не съществува!");
                }
            } else {
                System.out.println("Невалиден избор!");
            }

            System.out.println();
        }
    }
}
