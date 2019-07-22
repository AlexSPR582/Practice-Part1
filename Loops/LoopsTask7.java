package Loops;

import java.util.Scanner;

public class LoopsTask7 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число m");
        int m = sc.nextInt();
        System.out.println("Введите число n");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++){
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    System.out.print(j + " ");

                }
            }
            System.out.println();
        }

    }
}
