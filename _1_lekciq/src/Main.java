import java.util.*;
class Lotsavar {
    int num;
    double val;
    String name;
    Lotsavar cls;
}
public class Main {
    public static void inputArray(double [] Array){
        System.out.println("Input data: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            double n = Double.parseDouble(scanner.nextLine());
            Array[i] = n;
        }
    }
    public static void printArray(double [] Array){
        for (Double d: Array) {
            System.out.printf("%d ", d);
        }
    }
    public static void main(String[] args) {
//        int n = 1;
//        double v;
//        boolean a;
//        String s1 = new String();
//        Lotsavar obj1, obj2;
//        obj1 = new Lotsavar();
//        System.out.println("Print statement " + obj1.num + "  kbgskbf "+ obj1.val);
//        System.out.printf("n = %d %d", n, n);
//        obj1.num = 1;
//        obj1.val = 1.12;
//        obj1.name = "Name";

        int[] anArray = new int[10];
        float[] floatArray = new float[5];
        double[] A = new double[6];
        double [] B = new double[7];
    }
}
