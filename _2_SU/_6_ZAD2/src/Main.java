public class Main {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4, 8, 1, 9, 3};
        int search = 9;

        int index = findElement(nums, search);
        if (index != -1)
            System.out.println("the element " + search + " is on this position " + index);
        else
            System.out.println("this element is not found.");
    }
}