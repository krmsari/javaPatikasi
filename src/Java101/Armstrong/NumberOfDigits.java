package Java101.Armstrong;

import java.util.Scanner;

public class NumberOfDigits {
    Scanner scn = new Scanner(System.in);
    int num,total=0,variable;

    public void digits(){
        System.out.print("Sayiyi gir: ");
        num = scn.nextInt();
        while (num != 0) {
            variable = num % 10;
            total += variable;
            num /= 10;
        }
        System.out.println("Total= " + total);
    }
}
