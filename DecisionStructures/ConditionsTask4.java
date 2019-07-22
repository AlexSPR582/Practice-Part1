package DecisionStructures;

import java.util.Scanner;

public class ConditionsTask4 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = sc.nextInt();
        System.out.println("Введите число y");
        int y = sc.nextInt();
        System.out.println("Введите число z");
        int z = sc.nextInt();
        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        if ((z <= a & y <= b) | (y <= a & z <= b)){
            System.out.println("Кирпич пройдёт через отверствие");
        }
        else if ((z <= a & x <= b) | (z <= a & x <= b)) {
            System.out.println("Кирпич пройдёт через отверствие");
        }
        else if ((y <= a & x <= b) | (x <= a & y <= b)) {
            System.out.println("Кирпич пройдёт через отверствие");
        }
        else {
            System.out.println("Кирпич не пройдёт через отверстие");
        }
    }
}
