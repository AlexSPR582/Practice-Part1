package LineProgram;

import java.util.Scanner;

public class LineProgram1 {
    public void getResult(){
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
