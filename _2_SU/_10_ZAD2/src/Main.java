import java.util.*;
public class Main {
    public static int[] removeOccurrences(int[] array, int value) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : array) {
            if (num != value) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int removeValue = 2;
        int[] newArray = removeOccurrences(numbers, removeValue);
        System.out.println("The new array without " + removeValue + " is: " + Arrays.toString(newArray));
    }
}