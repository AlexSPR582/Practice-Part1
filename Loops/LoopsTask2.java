package Сycles;

import java.util.Scanner;

public class CyclesTask2 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение а");
        int a = sc.nextInt();
        System.out.println("Введите значение b");
        int b = sc.nextInt();
        System.out.println("Введите значение h");
        int h = sc.nextInt();
        int x = a;
        while (x <= b){
            if (x > 2){
                System.out.print(x + " ");
                x += h;
            }
            else if (x <= 2){
                System.out.print(-x + " ");
                x += h;
            }
        }
    }
}
