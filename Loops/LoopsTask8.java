package Loops;

import java.util.*;

public class LoopsTask8 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        String firstNum = sc.nextLine();
        char[] firstNumArray = firstNum.toCharArray();
        System.out.println("Введите второе число");
        String secondNum = sc.nextLine();
        char[] secondNumArray = secondNum.toCharArray();
        Set<Character> numbers = new HashSet<>();
        for (char i: firstNumArray){
            for (char j: secondNumArray){
                if ((int) i == (int) j){
                    if (numbers.contains(i) == false){
                        numbers.add(i);
                        System.out.print(i + " ");
                    }
                }
            }
        }








    }
}
