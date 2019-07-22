package LineProgram;

import java.util.Scanner;

public class LineProgram6 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите x");
        int x = sc.nextInt();
        System.out.println("введите y");
        int y = sc.nextInt();
        if (y > 0 & y <= 4) {
            if (x <= 2 & x >= -2){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else if (x == 0 & y == -1){
            System.out.println("false");
        }
        else if (y <= 0 & y >= -3) {
            if (x >= -4 & x <= 4){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}

