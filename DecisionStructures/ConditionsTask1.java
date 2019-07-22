package DecisionStructures;

import java.util.Scanner;

public class ConditionsTask1 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение первого угла");
        int angle1 = sc.nextInt();
        System.out.println("Введите значение второго угла");
        int angle2 = sc.nextInt();
        int angle3 = 180 - (angle1 + angle2);
        if (angle3 > 0){
            if (angle1 == 90 | angle2 == 90 | angle3 == 90){
                System.out.println("такой треугольник существует и является прямоугольным");
            }
            else {
                System.out.println("такой треугольник существует, но не является прямоугольным");
            }
        }
        else {
            System.out.println("такого треугольника не существует");
        }
    }
}
