package DecisionStructures;

import java.util.Scanner;

public class ConditionsTask2 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите a");
        int a = sc.nextInt();
        System.out.println("введите b");
        int b = sc.nextInt();
        System.out.println("введите c");
        int c = sc.nextInt();
        System.out.println("введите d");
        int d = sc.nextInt();
        int min1 = 0;
        int min2 = 0;
        if (a > b){
            min1 = b;
        }
        else {
            min1 = a;
        }
        if (c > d){
            min2 = d;
        }
        else {
            min2 = c;
        }
        if (min1 >= min2){
            System.out.println(min1);
        }
        else {
            System.out.println(min2);
        }
    }
}
