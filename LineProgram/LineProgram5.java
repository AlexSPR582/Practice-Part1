package LineProgram;

import java.util.Scanner;

public class LineProgram5 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        double hours = (int) (time / 3600.0);
        double minutes = (int)((time - (hours * 3600)) / 60.0);
        double seconds = time - hours * 3600 - minutes * 60;
        System.out.println((int)hours + "ч " + (int)minutes + "мин " + (int)seconds + "c");
    }
}
