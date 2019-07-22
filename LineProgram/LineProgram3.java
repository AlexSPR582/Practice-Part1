package LineProgram;
import java.util.Scanner;
import java.lang.Math;

public class LineProgram3 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(z);
    }
}
