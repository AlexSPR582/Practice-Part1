import java.util.*;

public class Task4 {
    public static void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double number = sc.nextDouble();
        double intPart = (int) number;
        double doublePart = Math.round((number - intPart) * 1000);
        double convert = doublePart + intPart / 1000.0;
        System.out.println(convert);




    }
}
