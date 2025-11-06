public class Main {
    public static void main(String[] args) {
        int[] numbers = {-3, 5, 0, -1, 4, -7, 8};
        int positive = 0, negative = 0;

        for (int num : numbers) {
            if (num > 0){
                positive++;
            } else if (num < 0){
                negative++;
            }
        }
        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
    }
}
