import java.util.Scanner;

public class Main {
    public static int biggest(int[]arr){
        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(biggest(arr));
    }
}