package PalindromSayi;

import java.util.Scanner;

public class Palindrom {

    Scanner sc = new Scanner(System.in);
    int number,reverseNumb=0,lastNum=0;
    public boolean isPolindrom(){
        number = sc.nextInt();
        while (number != 0){
            lastNum=number%10;
            reverseNumb=(reverseNumb*10)+lastNum;
            number/=10;
        }
        System.out.print(reverseNumb);
        return true;
    }
}
