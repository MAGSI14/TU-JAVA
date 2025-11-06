// TODO JAVAC.BG
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void testMethod(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            arr[j]++;
        }
    }
    public static void testMethod(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
//        int i = 1;
//        int y = 2;
//        System.out.println(i+y);
//        String firstName = "Ivan";
//        String lastName = "Ivanov";
//        firstName = "Georgi"; /* vutreshna reff; v heap e */
//        String name = firstName + " " + lastName;
//        System.out.println(name);
//        Scanner scanner = new Scanner(System.in); // s new zadelqme pamet v heap; system.in e argument
//        System.out.println("Enter some text: ");
//        String s = scanner.nextLine();
//        System.out.println(s);
        int [] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        testMethod(arr);
        testMethod();
        System.out.println(Arrays.toString(arr));

    }
}