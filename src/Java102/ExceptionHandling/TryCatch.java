package Java102.ExceptionHandling;

import java.security.spec.ECField;
import java.util.Scanner;

public class TryCatch {

    public void exception(){
        Scanner sc = new Scanner(System.in);

        double result;
        try{
            double a = sc.nextByte();
            double b = sc.nextByte();
            result = a/b;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }finally {
            System.out.println("Bu kesim çalışır.");
        }
    }
}
