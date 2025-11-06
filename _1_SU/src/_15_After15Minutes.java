import java.util.*;
public class _15_After15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats the time? - ");
        String [] timeArr = scanner.nextLine().split(":");
        int hour =  Integer.parseInt(timeArr[0]);
        int minutes =  Integer.parseInt(timeArr[1]);
        minutes+=15;
        if(minutes>=60){
            hour++;
            minutes-=60;
            if(hour>23){
                hour = 0;
            }
        }
        if(hour<10){
            System.out.printf("0%d:", hour);
            if(minutes<10){
                System.out.printf("0%d", minutes);
            }else{
                System.out.printf("%d", minutes);
            }
        }else{
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}
