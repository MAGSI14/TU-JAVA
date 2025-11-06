import java.util.*;
public class BMICalc {
    public static void printIntroduction(){
        System.out.println("This program calculates your BMI");
    }
    public static float bmiFor(float height, float weight){
        float BMI = weight*703/(height*height);
        return BMI;
    }
    public static float getBMI(Scanner scanner){
        System.out.print("Enter your height(in inches): ");
        float height = scanner.nextFloat();
        System.out.print("Enter your weight(in pounds): ");
        float weight = scanner.nextFloat();
        return bmiFor(height,weight);
    }
    public static String getStatus(float BMI){
        if(BMI<=18.5){
            return "underweight";
        } else if(18.5<BMI && BMI<=25.0){
            return "normal";
        }else if (BMI>25 && BMI<=30){
            return "overweight";
        } else if (BMI>30) {
            return "obese";
        }
        return "";
    }
    public static void reportResults(int number, float BMI, String status){
        System.out.printf("The person %d has BMI = %.2f so he is %s",number, BMI, status);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printIntroduction();
        float BMI = getBMI(scanner);
        String status = getStatus(BMI);
        int number = 1;
        reportResults(number, BMI, status);
    }
}
