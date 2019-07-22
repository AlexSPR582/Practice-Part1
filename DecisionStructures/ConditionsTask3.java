package DecisionStructures;

import java.util.Scanner;

public class ConditionsTask3 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите значение x1");
        int x1 = sc.nextInt();
        System.out.println("введите значение y1");
        int y1 = sc.nextInt();
        System.out.println("введите значение x2");
        int x2 = sc.nextInt();
        System.out.println("введите значение y2");
        int y2 = sc.nextInt();
        System.out.println("введите значение x3");
        int x3 = sc.nextInt();
        System.out.println("введите значение y3");
        int y3 = sc.nextInt();
        int y = ((y2 - y1) * (x3 - x1) + (x2 - x1) * y1) / (x2 - x1);
        if (y == y3){
            System.out.println("точки лежат на одной прямой");
        }
        else {
            System.out.println("точки не лежат на одной прямой");
        }
    }
}
