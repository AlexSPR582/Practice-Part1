package Loops;

import java.lang.*;
import java.math.BigInteger;

public class LoopsTask4 {
    public void getResult(){
        BigInteger startValue = new BigInteger("1");
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= 200; i++){
            result = startValue.multiply(BigInteger.valueOf(i * i));
            startValue = result;
        }
        System.out.println(result);
    }
}
