import java.util.Scanner;

public class Task1 {
    public static void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение а");
        int a = sc.nextInt();
        System.out.println("Введите значение b");
        int b = sc.nextInt();
        System.out.println("Введите значение с");
        int c = sc.nextInt();
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }
}
