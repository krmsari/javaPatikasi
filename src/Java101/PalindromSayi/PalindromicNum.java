package Java101.PalindromSayi;
import java.util.Scanner;
public class PalindromicNum {
    Scanner sc = new Scanner(System.in);

    String result;

    public void palindromic() {
        int num,temp,reverseNum=0,digit;
        System.out.print("Sayi gir: ");
        num = sc.nextInt();
        temp=num;
        while ( temp != 0 ){
            digit=temp%10;
            reverseNum = (reverseNum*10)+digit;
            temp/=10;
        }
        result = (reverseNum == num)?"Sayi palindromik.":"Sayi Palindromik değil";
        System.out.println(result);
    }
}
