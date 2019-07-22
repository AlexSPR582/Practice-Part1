package Сycles;

import java.util.Scanner;

public class CyclesTask1 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
