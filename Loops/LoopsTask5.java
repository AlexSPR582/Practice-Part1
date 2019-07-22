package Сycles;

import java.util.Scanner;

public class LoopsTask5 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число e");
        double e = sc.nextDouble();
        double n = 1.0;
        double a = 1.0 / Math.pow(2.0, n) + 1.0 / Math.pow(3.0, n);
        double sum = 0.0;
        while(a >= e){
            sum += a;
            n++;
            a = 1.0 / Math.pow(2.0, n) + 1.0 / Math.pow(3.0, n);
        }
        System.out.println(sum);
    }

}
