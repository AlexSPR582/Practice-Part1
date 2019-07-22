package DecisionStructures;

import java.util.Scanner;

public class ConditionsTask5 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double x = sc.nextInt();
        double y = 0;
        if (x > 3){
            y = 1.0 / (Math.pow(x, 3) + 6);
            System.out.println(y);
        }
        else if (x == Math.cbrt(-6)){
            System.out.println("В данной точке функции не существует");
        }
        else if (x <= 3){
            y = x * x - 3 * x + 9;
            System.out.println(y);
        }



    }
}
