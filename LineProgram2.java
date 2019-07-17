import java.util.*;

public class LineProgram2 {
    public static void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        System.out.println("Введите число с");
        int c = sc.nextInt();
        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);


    }
}
